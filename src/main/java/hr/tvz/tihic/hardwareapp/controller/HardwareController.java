package hr.tvz.tihic.hardwareapp.controller;

import hr.tvz.tihic.hardwareapp.hardware.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("hardware")
public class HardwareController {
    private final HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService){
        this.hardwareService = hardwareService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<HardwareDTO> getAllHardware(){
        return hardwareService.findAll();
    }

    @GetMapping("/{code}")
    public ResponseEntity<HardwareDTO> getHardwareByCode(@PathVariable final String code){

        return hardwareService.findByCode(code)
                .map(
                        hardwareDTO -> ResponseEntity.status(HttpStatus.OK).body(hardwareDTO)
                )
                .orElseGet(
                        () -> ResponseEntity.notFound().build()
                );
    }

    @PostMapping
    public ResponseEntity<HardwareDTO> post(@Valid @RequestBody HardwareCommand command){
        return hardwareService.post(command)
                .map(
                    hardwareDTO -> ResponseEntity.status(HttpStatus.CREATED).body(hardwareDTO)
                )
                .orElseGet(
                        () -> ResponseEntity.status(HttpStatus.CONFLICT).build()
                );

    }


    @PutMapping("/{code}")
    public ResponseEntity<HardwareDTO> updatePrice(@PathVariable String code, @Valid @RequestBody PriceUpdateCommand hardwareCommand){
        return hardwareService.updatePrice(code, hardwareCommand)
                .map(
                        hardwareDTO -> ResponseEntity.status(HttpStatus.OK).body(hardwareDTO)
                )
                .orElseGet(
                        () -> ResponseEntity.notFound().build()
                );
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code){
        System.out.println(code);
        hardwareService.delete(code);
    }


}
