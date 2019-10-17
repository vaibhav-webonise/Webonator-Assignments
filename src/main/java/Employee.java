import javax.persistence.*;

@Entity
@Table(name = "employee_info")
public class Employee {
    @Id
    private String employee_id;
    private String name;
    private String employee_address;
    private String designation_EmployeeId;


    public Employee(String name, String employee_id, String employee_address,String designation_id) {
        super();
        this.employee_id = employee_id;
        this.name = name;
        this.employee_address = employee_address;
        this.designation_EmployeeId =designation_id;
       ;
    }

    public Employee() {
        super();
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmployee_id() {
        return employee_id;
    }

    void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    String getEmployee_address() {
        return employee_address;
    }

    void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    String getDesignation_EmployeeId(){
        return this.designation_EmployeeId;
    }

    void setDesignation_EmployeeId(String d1){
        this.designation_EmployeeId = designation_EmployeeId;
    }
}
