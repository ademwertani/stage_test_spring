package com.kian.test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApkController {

    @GetMapping("/downloadApk")
    public ResponseEntity<Resource> downloadApk() {
        Resource apkFile = new ClassPathResource("app-release.apk");
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/vnd.android.package-archive"))
                .body(apkFile);
    }
}
