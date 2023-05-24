package model;

public enum ResponsavelTarefa {
    JOAS("Joás França"),
    GLEYDSON("Gleydson Lima"),
    FABIA("Fabia Oliveira"),
    RAPHAELA("Raphaela Galhardo");
	

    private String responsavel;

    ResponsavelTarefa(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getResponsavel() {
        return responsavel;
    }
}