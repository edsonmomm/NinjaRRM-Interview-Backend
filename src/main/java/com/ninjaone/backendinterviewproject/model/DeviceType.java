package com.ninjaone.backendinterviewproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Types of device: Windows, Windows Server, Mac, etc
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String deviceName;
}
