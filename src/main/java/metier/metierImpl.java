package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
class metierImpl implements Imetier {
    @Autowired
    private IDao dao;
    public metierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*23;
        return res;
    }
    public void setDao(IDao dao) {  this.dao = dao; }
}
