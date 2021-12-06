package jp.co.plussum.ebatch.config;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

@Configuration
public class GoogleConfig {

    @Value("${service.google.drive-api.credentials}")
    private String googleCredentials;

    @Bean
    public Drive googleDrive() throws GeneralSecurityException, IOException {
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

        GoogleCredential credential = googleCredential();
        return new Drive.Builder(httpTransport,
                jsonFactory,
                credential)
                .build();
    }

    private GoogleCredential googleCredential() throws IOException {
        return GoogleCredential.fromStream(new FileInputStream(ResourceUtils.getFile(googleCredentials))).createScoped(DriveScopes.all());
    }
}
