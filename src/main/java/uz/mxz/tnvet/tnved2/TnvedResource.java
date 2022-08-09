package uz.mxz.tnvet.tnved2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.mxz.tnvet.tnved2.entity.Tnved;
import uz.mxz.tnvet.tnved2.service.TnvedService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TnvedResource {

    @GetMapping("/all")
    public ResponseEntity getAll(){
        List<Tnved> tnvedList = TnvedService.findAlls();
        return ResponseEntity.ok(tnvedList);
    }
}
