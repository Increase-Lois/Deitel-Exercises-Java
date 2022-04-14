package ClassExercises.Methods;

public class Native {
    private int scvId;
    private String name;
    private String gender;
    public Native(String name, int scvId){
        this.name = name;
        this.scvId =scvId;
        }

        public String getScvId(){
        String myscvId = "";
       myscvId ="SCV900" + scvId;
        return "SCV900" + scvId;
        }

        public void setScvId(int scvId){
            this.scvId =scvId;
        }
        public String getName() {
        return name;
    }
}
