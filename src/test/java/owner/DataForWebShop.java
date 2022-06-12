package owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:properties/dataWebshop.properties"
})
public interface DataForWebShop extends Config  {
    String login();
    String password();
    String authCookieName();
}
