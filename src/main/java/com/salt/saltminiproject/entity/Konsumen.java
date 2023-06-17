package com.salt.saltminiproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Konsumen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "kota")
    private String kota;

    @Column(name = "provinsi")
    private String provinsi;

    @Column(name = "tgl_registrasi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglRegistrasi;

    @Column(name = "status")
    private String status;

}
