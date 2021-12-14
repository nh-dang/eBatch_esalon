package jp.co.plussum.ebatch.util;

import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.TranscodingHints;
import org.apache.batik.transcoder.image.ImageTranscoder;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.util.SVGConstants;
import org.apache.batik.util.XMLResourceDescriptor;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class FileUtil {

	private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

	public static String getFileNameFromPath(String filePath) {
		if (filePath != null && filePath.contains("/")) {
			String[] pathSplits = filePath.split("/");
			return pathSplits[pathSplits.length - 1];
		} else {
			LOG.error("This is not file path:\t" + filePath);
			return null;
		}
	}

	public static String getFilePath(String directoryPath, String fileName) {
		return directoryPath + "/" + fileName;
	}

	public static String getPrefFromFileName(String fileName) {
		// convert from 広島県.xlsx to 広島県
		return fileName.replace(CommonConstant.EXCEL_EXTENSION, "");
	}

	public static Document convertStringToDocument(String xmlStr) {
		String parser = XMLResourceDescriptor.getXMLParserClassName();
		SAXSVGDocumentFactory df = new SAXSVGDocumentFactory(parser);
		Document doc = null;
		try {
			doc = df.createSVGDocument("", new StringReader(xmlStr));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}

	public static byte[] pngBytesFromSvg(String svg) throws TranscoderException, IOException {
		ByteArrayOutputStream oStream = new ByteArrayOutputStream();
		InputStream svgStream = new ByteArrayInputStream(svg.getBytes("utf-8"));
		TranscoderInput input = new TranscoderInput(svgStream);
		TranscoderOutput output = new TranscoderOutput(oStream);
		PNGTranscoder svgToPngConverter = new PNGTranscoder();
		svgToPngConverter.transcode(input, output);
		// Clean Up
		oStream.flush();
		oStream.close();
		return oStream.toByteArray();
	}
}
