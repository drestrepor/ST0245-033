import com.sun.jdi.request.StepRequest;

import javax.management.monitor.StringMonitor;

public class Dato {

    String estu_consecutivo1;
    String estu_exterior;
    String periodo;
    String estu_tieneetnia;
    String estu_tomo_cursopreparacion;
    String estu_cursodocentesies;
    String estu_cursoiesapoyoexterno;
    String estu_cursoiesexterna;
    String estu_simulacrotipoicfes;
    String estu_actividadrefuerzoareas;
    String estu_actividadrefuerzogeneric;
    String fami_trabajolaborpadre;
    String fami_trabajolabormadre;
    String fami_numlibros;
    String estu_inst_cod_departamento;
    String estu_tipodocumento1;
    String estu_nacionalidad1;
    String estu_genero1;
    String estu_fechanacimiento1;
    String periodo1;
    String estu_estudiante1;
    String estu_pais_reside1;
    String estu_depto_reside1;
    String estu_cod_reside_depto1;
    String estu_mcpio_reside1;
    String estu_cod_reside_mcpio1;
    String estu_areareside;
    String estu_valorpensioncolegio;
    String fami_educacionpadre1;
    String fami_educacionmadre1;
    String fami_ocupacionpadre1;
    String fami_ocupacionmadre1;
    String fami_estratovivienda1;
    String fami_nivelsisben;
    String fami_pisoshogar;
    String fami_tieneinternet1;
    String fami_tienecomputador1;
    String fami_tienemicroondas;
    String fami_tienehorno;
    String fami_tieneautomovil1;
    String fami_tienedvd;
    String fami_tiene_nevera1;
    String fami_tiene_celular1;
    String fami_telefono1;
    String fami_ingresofmiliarmensual;
    String estu_trabajaactualmente;
    String estu_antecedentes;
    String estu_expectativas;
    String cole_codigo_icfes;
    String cole_cod_dane_establecimiento;
    String cole_nombre_establecimiento;
    String cole_genero;
    String cole_naturaleza;
    String cole_calendario;
    String cole_bilingue;
    String cole_caracter;
    String cole_cod_dane_sede;
    String cole_nombre_sede;
    String cole_sede_principal;
    String cole_area_ubicacion;
    String cole_jornada;
    String cole_cod_mcpio_ubicacion;
    String cole_mcpio_ubicacion;
    String cole_cod_depto_ubicacion;
    String cole_depto_ubicacion;
    String punt_lenguaje;
    String punt_matematicas;
    String punt_biologia;
    String punt_quimica;
    String punt_fisica;
    String punt_ciencias_sociales;
    String punt_filosofia;
    String punt_ingles;
    String desemp_ingles;
    String profundiza;
    String puntaje_prof;
    String desemp_prof;
    String exito;


    /**
     * This is the constructor for Dato.
     * @param  estu_consecutivo1;
     @param  estu_exterior;
     @param  periodo;
     @param  estu_tieneetnia;
     @param  estu_tomo_cursopreparacion;
     @param  estu_cursodocentesies;
     @param  estu_cursoiesapoyoexterno;
     @param  estu_cursoiesexterna;
     @param  estu_simulacrotipoicfes;
     @param  estu_actividadrefuerzoareas;
     @param  estu_actividadrefuerzogeneric;
     @param  fami_trabajolaborpadre;
     @param  fami_trabajolabormadre;
     @param  fami_numlibros;
     @param  estu_inst_cod_departamento;
     @param  estu_tipodocumento1;
     @param  estu_nacionalidad1;
     @param  estu_genero1;
     @param  estu_fechanacimiento1;
     @param  periodo1;
     @param  estu_estudiante1;
     @param  estu_pais_reside1;
     @param  estu_depto_reside1;
     @param  estu_cod_reside_depto1;
     @param  estu_mcpio_reside1;
     @param  estu_cod_reside_mcpio1;
     @param  estu_areareside;
     @param  estu_valorpensioncolegio;
     @param  fami_educacionpadre1;
     @param  fami_educacionmadre1;
     @param  fami_ocupacionpadre1;
     @param  fami_ocupacionmadre1;
     @param  fami_estratovivienda1;
     @param  fami_nivelsisben;
     @param  fami_pisoshogar;
     @param  fami_tieneinternet1;
     @param  fami_tienecomputador1;
     @param  fami_tienemicroondas;
     @param  fami_tienehorno;
     @param  fami_tieneautomovil1;
     @param  fami_tienedvd;
     @param  fami_tiene_nevera1;
     @param  fami_tiene_celular1;
     @param  fami_telefono1;
     @param  fami_ingresofmiliarmensual;
     @param  estu_trabajaactualmente;
     @param  estu_antecedentes;
     @param  estu_expectativas;
     @param  cole_codigo_icfes;
     @param  cole_cod_dane_establecimiento;
     @param  cole_nombre_establecimiento;
     @param  cole_genero;
     @param  cole_naturaleza;
     @param  cole_calendario;
     @param  cole_bilingue;
     @param  cole_caracter;
     @param  cole_cod_dane_sede;
     @param  cole_nombre_sede;
     @param  cole_sede_principal;
     @param  cole_area_ubicacion;
     @param  cole_jornada;
     @param  cole_cod_mcpio_ubicacion;
     @param  cole_mcpio_ubicacion;
     @param  cole_cod_depto_ubicacion;
     @param  cole_depto_ubicacion;
     @param  punt_lenguaje;
     @param  punt_matematicas;
     @param  punt_biologia;
     @param  punt_quimica;
     @param  punt_fisica;
     @param  punt_ciencias_sociales;
     @param  punt_filosofia;
     @param  punt_ingles;
     @param  desemp_ingles;
     @param  profundiza;
     @param  puntaje_prof;
     @param  desemp_prof;
     @param  exito;

     */
    public Dato(String estu_consecutivo1,  String estu_exterior,   String periodo, String estu_tieneetnia, String estu_tomo_cursopreparacion,  String estu_cursodocentesies,   String estu_cursoiesapoyoexterno,
                String estu_cursoiesexterna,    String estu_simulacrotipoicfes, String estu_actividadrefuerzoareas, String estu_actividadrefuerzogeneric,   String fami_trabajolaborpadre,  String fami_trabajolabormadre,
                String fami_numlibros,  String estu_inst_cod_departamento,  String estu_tipodocumento1,    String estu_nacionalidad1, String estu_genero1,   String estu_fechanacimiento1,  String periodo1,
                String estu_estudiante1,   String estu_pais_reside1,  String estu_depto_reside1, String estu_cod_reside_depto1, String estu_mcpio_reside1, String estu_cod_reside_mcpio1, String estu_areareside,
                String estu_valorpensioncolegio,    String fami_educacionpadre1,   String fami_educacionmadre1,   String fami_ocupacionpadre1,   String fami_ocupacionmadre1,   String fami_estratovivienda1,
                String fami_nivelsisben,    String fami_pisoshogar, String fami_tieneinternet1,    String fami_tienecomputador1,  String fami_tienemicroondas,    String fami_tienehorno, String fami_tieneautomovil1,
                String fami_tienedvd,   String fami_tiene_nevera1, String fami_tiene_celular1,    String fami_telefono1, String fami_ingresofmiliarmensual,  String estu_trabajaactualmente, String estu_antecedentes,
                String estu_expectativas,   String cole_codigo_icfes,   String cole_cod_dane_establecimiento,   String cole_nombre_establecimiento, String cole_genero, String cole_naturaleza, String cole_calendario,
                String cole_bilingue,   String cole_caracter,   String cole_cod_dane_sede,  String cole_nombre_sede,  String cole_sede_principal, String cole_area_ubicacion, String cole_jornada,    String cole_cod_mcpio_ubicacion,
                String cole_mcpio_ubicacion,    String cole_cod_depto_ubicacion,    String cole_depto_ubicacion,    String punt_lenguaje,   String punt_matematicas,  String punt_biologia,   String punt_quimica,    String punt_fisica,  String punt_ciencias_sociales,
                String punt_filosofia,   String punt_ingles,  String desemp_ingles,    String profundiza,   String puntaje_prof,     String desemp_prof,  String exito) {
        this.estu_consecutivo1 = estu_consecutivo1 ;
        this.estu_exterior = estu_exterior ;
        this.periodo = periodo ;
        this.estu_tieneetnia = estu_tieneetnia ;
        this.estu_tomo_cursopreparacion = estu_tomo_cursopreparacion  ;
        this.estu_cursodocentesies = estu_cursodocentesies ;
        this.estu_cursoiesapoyoexterno = estu_cursoiesapoyoexterno  ;
        this.estu_cursoiesexterna = estu_cursoiesexterna  ;
        this.estu_simulacrotipoicfes = estu_simulacrotipoicfes  ;
        this.estu_actividadrefuerzoareas =  estu_actividadrefuerzoareas ;
        this.estu_actividadrefuerzogeneric = estu_actividadrefuerzogeneric  ;
        this.fami_trabajolaborpadre = fami_trabajolaborpadre  ;
        this.fami_trabajolabormadre = fami_trabajolabormadre ;
        this.fami_numlibros = fami_numlibros ;
        this.estu_inst_cod_departamento = estu_inst_cod_departamento  ;
        this.estu_tipodocumento1 = estu_tipodocumento1 ;
        this.estu_nacionalidad1 = estu_nacionalidad1  ;
        this.estu_genero1 = estu_genero1  ;
        this.estu_fechanacimiento1 = estu_fechanacimiento1  ;
        this.periodo1 = periodo1 ;
        this.estu_estudiante1 = estu_estudiante1 ;
        this.estu_pais_reside1 = estu_pais_reside1 ;
        this.estu_depto_reside1 = estu_depto_reside1 ;
        this.estu_cod_reside_depto1 = estu_cod_reside_depto1  ;
        this.estu_mcpio_reside1 = estu_mcpio_reside1 ;
        this.estu_cod_reside_mcpio1 = estu_cod_reside_mcpio1 ;
        this.estu_areareside = estu_areareside ;
        this.estu_valorpensioncolegio = estu_valorpensioncolegio ;
        this.fami_educacionpadre1 = fami_educacionpadre1 ;
        this.fami_educacionmadre1 = fami_educacionmadre1 ;
        this.fami_ocupacionpadre1 = fami_ocupacionpadre1 ;
        this.fami_ocupacionmadre1 = fami_ocupacionmadre1 ;
        this.fami_estratovivienda1 = fami_estratovivienda1 ;
        this.fami_nivelsisben = fami_nivelsisben ;
        this.fami_pisoshogar = fami_pisoshogar ;
        this.fami_tieneinternet1 =  fami_tieneinternet1;
        this.fami_tienecomputador1 = fami_tienecomputador1 ;
        this.fami_tienemicroondas = fami_tienemicroondas ;
        this.fami_tienehorno = fami_tienehorno ;
        this.fami_tieneautomovil1 = fami_tieneautomovil1 ;
        this.fami_tienedvd = fami_tienedvd ;
        this.fami_tiene_nevera1 = fami_tiene_nevera1 ;
        this.fami_tiene_celular1 = fami_tiene_celular1 ;
        this.fami_telefono1 = fami_telefono1 ;
        this.fami_ingresofmiliarmensual = fami_ingresofmiliarmensual ;
        this.estu_antecedentes = estu_antecedentes ;
        this.estu_trabajaactualmente = estu_trabajaactualmente  ;
        this.estu_expectativas = estu_expectativas ;
        this.cole_codigo_icfes = cole_codigo_icfes  ;
        this.cole_cod_dane_establecimiento = cole_cod_dane_establecimiento ;
        this.cole_nombre_establecimiento = cole_nombre_establecimiento ;
        this.cole_genero = cole_genero ;
        this.cole_naturaleza = cole_naturaleza ;
        this.cole_calendario = cole_calendario ;
        this.cole_bilingue = cole_bilingue ;
        this.cole_caracter = cole_caracter  ;
        this.cole_cod_dane_sede = cole_cod_dane_sede ;
        this.cole_nombre_sede = cole_nombre_sede ;
        this.cole_sede_principal = cole_sede_principal ;
        this.cole_area_ubicacion = cole_area_ubicacion ;
        this.cole_jornada = cole_jornada ;
        this.cole_cod_mcpio_ubicacion = cole_cod_mcpio_ubicacion ;
        this.cole_mcpio_ubicacion =  cole_mcpio_ubicacion;
        this.cole_cod_depto_ubicacion = cole_cod_depto_ubicacion ;
        this.cole_depto_ubicacion = cole_depto_ubicacion ;
        this.punt_lenguaje =  punt_lenguaje;
        this.punt_matematicas = punt_matematicas ;
        this.punt_biologia = punt_biologia ;
        this.punt_quimica = punt_quimica ;
        this.punt_fisica = punt_fisica ;
        this.punt_ciencias_sociales = punt_ciencias_sociales ;
        this.punt_filosofia = punt_filosofia ;
        this.punt_ingles = punt_ingles ;
        this.desemp_ingles = desemp_ingles ;
        this.profundiza = profundiza ;
        this.puntaje_prof = puntaje_prof ;
        this.desemp_prof = desemp_prof ;
        this.exito = exito  ;
    }

    public String getCole_area_ubicacion() {
        return cole_area_ubicacion;
    }

    public String getCole_bilingue() {
        return cole_bilingue;
    }

    public String getCole_calendario() {
        return cole_calendario;
    }

    public String getCole_caracter() {
        return cole_caracter;
    }

    public String getCole_cod_dane_establecimiento() {
        return cole_cod_dane_establecimiento;
    }

    public String getCole_cod_dane_sede() {
        return cole_cod_dane_sede;
    }

    public String getCole_cod_depto_ubicacion() {
        return cole_cod_depto_ubicacion;
    }

    public String getCole_cod_mcpio_ubicacion() {
        return cole_cod_mcpio_ubicacion;
    }

    public String getCole_codigo_icfes() {
        return cole_codigo_icfes;
    }

    public String getCole_depto_ubicacion() {
        return cole_depto_ubicacion;
    }

    public String getCole_genero() {
        return cole_genero;
    }

    public String getCole_jornada() {
        return cole_jornada;
    }

    public String getCole_mcpio_ubicacion() {
        return cole_mcpio_ubicacion;
    }

    public String getCole_naturaleza() {
        return cole_naturaleza;
    }

    public String getCole_nombre_establecimiento() {
        return cole_nombre_establecimiento;
    }

    public String getCole_nombre_sede() {
        return cole_nombre_sede;
    }

    public String getCole_sede_principal() {
        return cole_sede_principal;
    }

    public String getDesemp_ingles() {
        return desemp_ingles;
    }

    public String getDesemp_prof() {
        return desemp_prof;
    }

    public String getEstu_actividadrefuerzoareas() {
        return estu_actividadrefuerzoareas;
    }

    public String getEstu_actividadrefuerzogeneric() {
        return estu_actividadrefuerzogeneric;
    }

    public String getEstu_antecedentes() {
        return estu_antecedentes;
    }

    public String getEstu_areareside() {
        return estu_areareside;
    }

    public String getEstu_cod_reside_depto() { return estu_cod_reside_depto1; }

    public String getEstu_cod_reside_mcpio() {
        return estu_cod_reside_mcpio1;
    }

    public String getEstu_consecutivo() {
        return estu_consecutivo1;
    }

    public String getEstu_cursodocentesies() {
        return estu_cursodocentesies;
    }

    public String getEstu_cursoiesapoyoexterno() {
        return estu_cursoiesapoyoexterno;
    }

    public String getEstu_cursoiesexterna() {
        return estu_cursoiesexterna;
    }

    public String getEstu_depto_reside() {
        return estu_depto_reside1;
    }

    public String getEstu_estudiante() {
        return estu_estudiante1;
    }

    public String getEstu_expectativas() {
        return estu_expectativas;
    }

    public String getEstu_exterior() {
        return estu_exterior;
    }

    public String getEstu_fechanacimiento() { return estu_fechanacimiento1; }

    public String getEstu_genero() {
        return estu_genero1;
    }

    public String getEstu_inst_cod_departamento() {
        return estu_inst_cod_departamento;
    }

    public String getEstu_mcpio_reside() {
        return estu_mcpio_reside1;
    }

    public String getEstu_nacionalidad() { return estu_nacionalidad1; }

    public String getEstu_pais_reside() {
        return estu_pais_reside1;
    }

    public String getEstu_simulacrotipoicfes() {
        return estu_simulacrotipoicfes;
    }

    public String getEstu_tieneetnia() {
        return estu_tieneetnia;
    }

    public String getEstu_tipodocumento() {
        return estu_tipodocumento1;
    }

    public String getEstu_tomo_cursopreparacion() {
        return estu_tomo_cursopreparacion;
    }

    public String getEstu_trabajaactualmente() {
        return estu_trabajaactualmente;
    }

    public String getEstu_valorpensioncolegio() {
        return estu_valorpensioncolegio;
    }

    public String getExito() {
        return exito;
    }

    public String getFami_educacionmadre() {
        return fami_educacionmadre1;
    }

    public String getFami_educacionpadre() {
        return fami_educacionpadre1;
    }

    public String getFami_estratovivienda() {
        return fami_estratovivienda1;
    }

    public String getFami_ingresofmiliarmensual() {
        return fami_ingresofmiliarmensual;
    }

    public String getFami_nivelsisben() {
        return fami_nivelsisben;
    }

    public String getFami_numlibros() {
        return fami_numlibros;
    }

    public String getFami_ocupacionmadre() {
        return fami_ocupacionmadre1;
    }

    public String getFami_ocupacionpadre() {
        return fami_ocupacionpadre1;
    }

    public String getFami_pisoshogar() {
        return fami_pisoshogar;
    }

    public String getFami_telefono() {
        return fami_telefono1;
    }

    public String getFami_tiene_celular() {
        return fami_tiene_celular1;
    }

    public String getFami_tiene_nevera() {
        return fami_tiene_nevera1;
    }

    public String getFami_tieneautomovil() { return fami_tieneautomovil1; }

    public String getFami_tienecomputador() {
        return fami_tienecomputador1;
    }

    public String getFami_tienedvd() {
        return fami_tienedvd;
    }

    public String getFami_tienehorno() {
        return fami_tienehorno;
    }

    public String getFami_tieneinternet() {
        return fami_tieneinternet1;
    }

    public String getFami_tienemicroondas() {
        return fami_tienemicroondas;
    }

    public String getFami_trabajolabormadre() {
        return fami_trabajolabormadre;
    }

    public String getFami_trabajolaborpadre() {
        return fami_trabajolaborpadre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getProfundiza() {
        return profundiza;
    }

    public String getPunt_biologia() {
        return punt_biologia;
    }

    public String getPunt_ciencias_sociales() {
        return punt_ciencias_sociales;
    }

    public String getPunt_filosofia() {
        return punt_filosofia;
    }

    public String getPunt_fisica() {
        return punt_fisica;
    }

    public String getPunt_ingles() {
        return punt_ingles;
    }

    public String getPunt_lenguaje() {
        return punt_lenguaje;
    }

    public String getPunt_matematicas() {
        return punt_matematicas;
    }

    public String getPunt_quimica() {
        return punt_quimica;
    }

    public String getPuntaje_prof() {
        return puntaje_prof;
    }

    /**
     * This method gets the value asked
     * by the program.
     * @param i posición de la cual se quiere
     *          conocer el valor.
     * @return valor.
     * @throws Exception que dice que no existe el dato pedido.
     */
    public String getValue(int i) throws Exception {
        switch (i) {
            case 0:
                return getCole_area_ubicacion();
            case 1:
                return getCole_bilingue();
            case 2:
                return getCole_calendario();
            case 3:
                return getCole_caracter();
            case 4:
                return getCole_cod_dane_establecimiento();
            case 5:
                return getCole_cod_dane_sede();
            case 6:
                return getCole_depto_ubicacion();
            case 7:
                return getCole_cod_mcpio_ubicacion();
            case 8:
                return getCole_codigo_icfes();
            case 9:
                return getCole_cod_depto_ubicacion();
            case 10:
                return getCole_genero();
            case 11:
                return getCole_jornada();
            case 12:
                return getCole_mcpio_ubicacion();
            case 13:
                return getCole_naturaleza();
            case 14:
                return getCole_nombre_establecimiento();
            case 15:
                return getCole_nombre_sede();
            case 16:
                return getCole_sede_principal();
            case 17:
                return getDesemp_ingles();
            case 18:
                return getDesemp_prof();
            case 19:
                getEstu_actividadrefuerzoareas();
            case 20:
                getEstu_actividadrefuerzogeneric();
            case 21:
                return getEstu_antecedentes();
            case 22:
                return getEstu_areareside();
            case 23:
                return getEstu_cod_reside_depto();
            case 24:
                return getEstu_cod_reside_mcpio();
            case 25:
                return getEstu_consecutivo();
            case 26:
                return getEstu_cursodocentesies();
            case 27:
                return getEstu_cursoiesapoyoexterno();
            case 28:
                return getEstu_cursoiesexterna();
            case 29:
                return getEstu_depto_reside();
            case 30:
                return getEstu_estudiante();
            case 31:
                return getEstu_expectativas();
            case 32:
                return getEstu_exterior();
            case 33:
                return getEstu_fechanacimiento();
            case 34:
                return getEstu_genero();
            case 35:
                return getEstu_inst_cod_departamento();
            case 36:
                return getEstu_mcpio_reside();
            case 37:
                return getEstu_nacionalidad();
            case 38:
                return getEstu_pais_reside();
            case 39:
                return getEstu_simulacrotipoicfes();
            case 40:
                return getEstu_tieneetnia();
            case 41:
                return getEstu_tipodocumento();
            case 42:
                return getEstu_tomo_cursopreparacion();
            case 43:
                return getEstu_trabajaactualmente();
            case 44:
                return getEstu_valorpensioncolegio();
            case 45:
                return getExito();
            case 46:
                return getFami_educacionmadre();
            case 47:
                return getFami_educacionpadre();
            case 48:
                return getFami_estratovivienda();
            case 49:
                return getFami_ingresofmiliarmensual();
            case 50:
                return getFami_nivelsisben();
            case 51:
                return getFami_numlibros();
            case 52:
                return getFami_ocupacionmadre();
            case 53:
                return getFami_ocupacionpadre();
            case 54:
                return getFami_pisoshogar();
            case 55:
                return getFami_telefono();
            case 56:
                return getFami_tiene_celular();
            case 57:
                return getFami_tiene_nevera();
            case 58:
                return getFami_tieneautomovil();
            case 59:
                return getFami_tienecomputador();
            case 60:
                return getFami_tienedvd();
            case 61:
                return getFami_tienehorno();
            case 62:
                return getFami_tieneinternet();
            case 63:
                return getFami_tienemicroondas();
            case 64:
                return getFami_trabajolabormadre();
            case 65:
                return getFami_trabajolaborpadre();
            case 66:
                return getPeriodo();
            case 67:
                return getProfundiza();
            case 68:
                return getPunt_biologia();
            case 69:
                return getPunt_ciencias_sociales();
            case 70:
                return getPunt_filosofia();
            case 71:
                return getPunt_fisica();
            case 72:
                return getPunt_ingles();
            case 73:
                return getPunt_lenguaje();
            case 74:
                return getPunt_matematicas();
            case 75:
                return getPunt_quimica();
            case 76:
                return getPuntaje_prof();



            default:
                throw new Exception("No existe el tipo de dato mencionado");
        }
    }
}
