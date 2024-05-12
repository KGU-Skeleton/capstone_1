package com.example.capstone.incoding;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

@Component
public class ImageEncoder {



    public String encodeImageToBase64(File imageFile) throws IOException {
        FileInputStream imageInFile = new FileInputStream(imageFile);
        byte[] imageData = new byte[(int) imageFile.length()];
        imageInFile.read(imageData);

        // Java 8 이상에서 Base64.getEncoder()를 사용할 수 있습니다.
        // Java 7 이하에서는 Apache Commons Codec 라이브러리 등을 사용할 수 있습니다.
        String base64Image = Base64.getEncoder().encodeToString(imageData);

        imageInFile.close();
        return base64Image;
    }
}
