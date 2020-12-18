package Lesson7;

public  final class ApplicationGlobalState {
    private static ApplicationGlobalState INSDTANCE;
    private static final String API_KEY = "GsvXrNaxMpldrOrntrfKZWEQCLCoGxMq";
    private String selectedCity = null;

    private ApplicationGlobalState(){
    }
   public static ApplicationGlobalState getInstance(){
        if (INSDTANCE == null){
            INSDTANCE = new ApplicationGlobalState();
        }
        return INSDTANCE;
   }
   public String getSelectedCity(){
        return selectedCity;
   }
   public String getApiKey(){
        return this.API_KEY;
   }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
}
