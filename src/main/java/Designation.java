import javax.persistence.*;

@Entity
@Table(name="Designation")
public class Designation {

    @Id
    private String designation_Id;
    private String designation_Name;

    @OneToOne
    private Employee employee;

    public Designation(String designation_id,String designation_name){
        super();
        this.designation_Id=designation_id;
        this.designation_Name=designation_name;
    }

    public Designation(){
        super();
    }

    void setDesignation_Id(String designation_id){
        this.designation_Id=designation_id;
    }

    String getDesignation_Id(){
        return this.designation_Id;
    }

    void setDesignation_Name(String designation_name){
        this.designation_Name=designation_name;
    }

    String getDesignation_Name(){
        return this.designation_Name;
    }

    void setEmployee(Employee employee){
        this.employee=employee;
    }

    Employee getEmployee(){
        return  this.employee;
    }
}
