package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double t = 77;
        return t;
    }
}
