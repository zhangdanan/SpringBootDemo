package sloth.zhang.hasor;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.core.Hasor;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 21:03 2020/5/14
 * @Modificd By;
 */
@DimModule
@Component
public class ExampleModule implements SpringModule {

    @Autowired
    private DataSource dataSource = null;
    @Override
    public void loadModule(ApiBinder apiBinder) throws Throwable {
        apiBinder.installModule( new JdbcModule( Level.Full,this.dataSource ) );
    }
}
