public class Currency {
    private String code;
    private String name;

    public Currency(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }


    public void setCode(String code){
        this.code = code;
    }

    public void setName(String name){
        this.name = name;
    }

}
