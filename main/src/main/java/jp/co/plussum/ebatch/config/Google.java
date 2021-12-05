package jp.co.plussum.ebatch.config;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;

@Component
public class Google {

    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    public Drive getService() throws GeneralSecurityException, IOException {
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        return new Drive.Builder(HTTP_TRANSPORT,
                JacksonFactory.getDefaultInstance(), googleCredential())
                .build();
    }

    public GoogleCredential googleCredential() throws GeneralSecurityException, IOException {
        /*Collection<String> elenco = new ArrayList<>();
        elenco.add("https://www.googleapis.com/auth/drive");
        HttpTransport httpTransport = new NetHttpTransport();
        JacksonFactory jsonFactory = new JacksonFactory();
        return new GoogleCredential.Builder()
                .setsetTransport(httpTransport)
                .setJsonFactory(jsonFactory)
                .setServiceAccountId("google-driver-demo@gdriverdemo-334116.iam.gserviceaccount.com")
                .setServiceAccountScopes(elenco)
                .setServiceAccountPrivateKeyFromP12File(ResourceUtils.getFile("classpath:google_credentials/gdriverdemo-334116-252c09b3725c.p12"))
                .build();*/
        return GoogleCredential.fromStream(new FileInputStream(ResourceUtils.getFile("classpath:google_credentials/gdriverdemo-334116-70ec4e56292c.json")));
    }
}
