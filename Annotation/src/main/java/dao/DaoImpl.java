package dao;

import org.springframework.stereotype.Component;
@Component
public class DaoImpl implements IDao{
    public double getData() {
        System.out.println("From SQL DB");
        return (7);
    }
}