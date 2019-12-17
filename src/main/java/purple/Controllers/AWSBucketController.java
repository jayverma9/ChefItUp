package purple.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import purple.POJOS.AmazonAWSClient;

@RestController
@RequestMapping("/storage")
public class AWSBucketController {

    private AmazonAWSClient amazonClient;

    @Autowired
    AWSBucketController(AmazonAWSClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @CrossOrigin
    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
//        System.out.println(file.toString());
        System.out.println("HIIIIIIIIIIII");
        return new ResponseEntity<String>(this.amazonClient.uploadFile(file), HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }

}
