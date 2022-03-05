package herdado;

public class Client {
    private String name;
    private String cpf;
    private String work;

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getWork(){
        return work;
    }
    public void setWork(String work){
        this.work = work;
    }
}
