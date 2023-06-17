package com.salt.saltminiproject.controller;

import com.salt.saltminiproject.dto.KonsumenDTO;
import com.salt.saltminiproject.entity.Konsumen;
import com.salt.saltminiproject.service.KonsumenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class KonsumenController {

    private final KonsumenService konsumenService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        List<Konsumen> konsumenList = konsumenService.getAll();
        log.info("konsumen list size : {} ", konsumenList.size());
        return new ModelAndView("index-page", Map.of("dataList", konsumenList));
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        return new ModelAndView("add-page");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAct(
            @RequestParam("nama") String nama,
            @RequestParam("alamat") String alamat,
            @RequestParam("kota") String kota,
            @RequestParam("provinsi") String provinsi,
            @RequestParam("tgl_registrasi") String tglRegistrasi,
            @RequestParam("status") String status
    ) {
        Konsumen konsumen = Konsumen.builder()
                .nama(nama)
                .alamat(alamat)
                .kota(kota)
                .provinsi(provinsi)
                .tglRegistrasi(Date.valueOf(tglRegistrasi))
                .status(status)
                .build();
        konsumenService.addKonsumen(konsumen);
        return "redirect:/index";
    }

}
