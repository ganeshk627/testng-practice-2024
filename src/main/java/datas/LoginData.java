package datas;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "logindata", parallel = true)
    public Object[][] getLoginData() {
        Object[][] data =
                {
                        {"admin", "admin123"},
                        {"ADMIN", "admin123"},
                        {"Admin", "admin123"},
                        {"AdmIn", "admin123"},
                };
        return data;
    }

}
