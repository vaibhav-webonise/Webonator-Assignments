import javax.persistence.*;

public class PersistEmployee {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employee_details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

       //insert
        Employee insertDataToEmployee = new Employee();
        insertDataToEmployee.setEmployee_address("Nashik");
        insertDataToEmployee.setName("Parikshit");
        insertDataToEmployee.setEmployee_id("W303");
        insertDataToEmployee.setDesignation_EmployeeId("D1");
        entityManager.persist(insertDataToEmployee);

        //search
        Employee getDataFromEmployee = entityManager.find(Employee.class, "W303");
        System.out.print("\n Name: "+getDataFromEmployee.getName());
        System.out.print("\n Employee_Id: "+getDataFromEmployee.getEmployee_id());
        System.out.print("\n Address: "+getDataFromEmployee.getEmployee_address());


        //update
        Employee updateDataToEmployee = entityManager.find(Employee.class, "W202");
        updateDataToEmployee.setEmployee_address("Solapur");
        entityManager.persist(updateDataToEmployee);

        //Remove
        Employee removeDataFromEmployee = entityManager.find(Employee.class, "W303");
        entityManager.remove(removeDataFromEmployee);

        //OneToOne
        Designation designation=new Designation();
        designation.setDesignation_Id("D1");
        designation.setDesignation_Name("Developer");
        designation.setEmployee(insertDataToEmployee);
        entityManager.persist(designation);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
