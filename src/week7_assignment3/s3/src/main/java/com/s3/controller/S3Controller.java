package com.s3.controller;

import com.s3.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("s3bucket")

public class S3Controller {

    private BucketService bucketService;

    @Autowired
    public S3Controller(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @PostMapping("/add/{bucketName}")
    public ResponseEntity<String> createBucket(@PathVariable String bucketName) {
        return new ResponseEntity<>(bucketService.createBucket(bucketName), HttpStatus.OK);
    }

    @PostMapping(path = "/upload/file/{bucketName}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> uploadFile(@RequestBody MultipartFile file,
                                             @PathVariable String bucketName) {
        return new ResponseEntity<>(bucketService.uploadFile(file,bucketName), HttpStatus.OK);
    }


    @DeleteMapping(path="/delete/file/{bucketName}/{fileName}")
    public ResponseEntity<String> deleteFile(@PathVariable String bucketName,@PathVariable String fileName)
    {
        return new ResponseEntity<>(bucketService.deleteFile(bucketName,fileName),HttpStatus.OK);
    }

    @DeleteMapping("/delete/bucket/{bucketName}")
    public ResponseEntity<String> deleteBucket(@PathVariable String bucketName) {
        return new ResponseEntity<>(bucketService.deleteBucket(bucketName), HttpStatus.OK);
    }
}
