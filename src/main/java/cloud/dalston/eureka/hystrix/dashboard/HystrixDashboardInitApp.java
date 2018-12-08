package cloud.dalston.eureka.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard /** use hystrix dashboard,查看单实例前，需要先出发一次实例的接口。不然会一直显示loading。。。 **/
@SpringCloudApplication
public class HystrixDashboardInitApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(HystrixDashboardInitApp.class, args);
    }
}
