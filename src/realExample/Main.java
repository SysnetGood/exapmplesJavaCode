package realExample;

public class Main {

    public static void main(String[] args) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getPopUp().verifySaveButton();
        dashboardPage.getPopUp().verifyCancelButton();
        dashboardPage.getPopUp().verifyCloseButton();
    }
}
