package hr.tvz.tihic.hardwareapp.controller;

import hr.tvz.tihic.hardwareapp.hardware.HardwareDTO;
import hr.tvz.tihic.hardwareapp.hardware.HardwareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hardware")
public class HardwareController {
    private final HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService){
        this.hardwareService = hardwareService;
    }

    @GetMapping
    public List<HardwareDTO> getAllHardware(){
        return hardwareService.findAll();
    }

    @GetMapping(params = "code")
    public HardwareDTO getHardwareByCode(@RequestParam final String code){
        return hardwareService.findByCode(code);
    }

}
