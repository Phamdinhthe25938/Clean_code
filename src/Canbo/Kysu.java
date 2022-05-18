package Canbo;

import java.util.Date;

public class Kysu  extends Canbo{
    private String trainingIndustry;

    public Kysu() {
    }


    public Kysu(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public Kysu(String name, String date, String gender, String address, String trainingIndustry) {
        super(name, date, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public void nameJobManager() {

    }

    @Override
    public String toString() {
        return "Kysu{" +
                super.toString()+
                "trainingIndustry='" + this.getTrainingIndustry() + '\'' +
                '}';
    }
}
