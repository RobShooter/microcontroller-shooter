package de.thi.microcontroller.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Microcontroller implements Serializable{

    private String name;
    private String architektur;
    private String bauform;
    private List<String> schnittstellen = new ArrayList<>();

    public Microcontroller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArchitektur() {
        return architektur;
    }

    public void setArchitektur(String architektur) {
        this.architektur = architektur;
    }

    public String getBauform() {
        return bauform;
    }

    public void setBauform(String bauform) {
        this.bauform = bauform;
    }

    public List<String> getSchnittstellen() {
        return schnittstellen;
    }

    public void setSchnittstellen(List<String> schnittstellen) {
        this.schnittstellen = schnittstellen;
    }
}
