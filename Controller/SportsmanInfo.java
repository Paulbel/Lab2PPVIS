package Controller;

import Model.Sport;
import Model.Sportsman;
import Model.SportsmanInfoData;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sinelnikov on 29.03.2017.
 */
public class SportsmanInfo {
    private MainFrame mainFrame;
    //private List<Sportsman> sportsmanList;
   // private SportList sportList;
   // private PageWalker walker;
    //private JScrollPane tablePanel;
    SportsmanInfoData sportsmanInfoData;
    public void run() {
        sportsmanInfoData = new SportsmanInfoData();
        Sport football = new Sport("Футбол", new String[]{"ВРТ", "ЦЗ", "ПЗ", "ЛЗ", "ЦП", "ЛП", "ПП", "ЦАП", "ФРВ"});
        sportsmanInfoData.addSport(football);
        sportsmanInfoData.addSport(new Sport("Хыккей", new String[]{"ВРТ", "ЛЗ", "ПЗ", "ПН", "ЛН", "ЦН"}));
        sportsmanInfoData.addSport(new Sport("Хиккей", new String[]{"ВРТ", "ЛЗ", "ПЗ", "ПН", "ЛН", "ЦН"}));
        sportsmanInfoData.addSport(new Sport("Хоккуй", new String[]{"ВРТ", "ЛЗ", "ПЗ", "ПН", "ЛН", "ЦН"}));
        sportsmanInfoData.addSport(new Sport("Хаккей", new String[]{"ВРТ", "ЛЗ", "ПЗ", "ПН", "ЛН", "ЦН"}));





/*        sportsmanList = new ArrayList<>();
        sportList = new SportList();
        walker = new PageWalker(sportsmanList);
        sportList.addSportType("Футбол", new String[]{"ВРТ", "ЦЗ", "ПЗ", "ЛЗ", "ЦП", "ЛП", "ПП", "ЦАП", "ФРВ"});
        sportList.addSportType("Хоккей", new String[]{"ВРТ", "ЛЗ", "ПЗ", "ПН", "ЛН", "ЦН"});
        sportList.addSportType("Плавание", new String[]{"Нет"});
        mainFrame = new MainFrame(this);*/


       // SportsmanTable sportsmanTable = new SportsmanTable(sportsmanList);

        Sportsman sportsman = new Sportsman();
        sportsman.setFirstName("Павел");
        sportsman.setSecondName("Синельников");
        sportsman.setThirdName("Михайлович");
        sportsman.setSport(football);
        sportsman.setLineup(0);
        sportsman.setPosition(1);
        sportsman.setRank(2);
        sportsman.setTitleNumber(2);


        Sportsman sportsman1 = new Sportsman();
        sportsman1.setFirstName("Максим");
        sportsman1.setSecondName("Стельмаченок");
        sportsman1.setThirdName("Олегович");
        sportsman1.setSport(football);
        sportsman1.setLineup(1);
        sportsman1.setPosition(2);
        sportsman1.setRank(3);
        sportsman1.setTitleNumber(2);


        Sportsman sportsman2 = new Sportsman();
        sportsman2.setFirstName("Алексей");
        sportsman2.setSecondName("Шульга");
        sportsman2.setThirdName("Юрьевич");
        sportsman2.setSport(football);
        sportsman2.setLineup(1);
        sportsman2.setPosition(2);
        sportsman2.setRank(2);
        sportsman2.setTitleNumber(5);


        Sportsman sportsman3 = new Sportsman();
        sportsman3.setFirstName("Jesse");
        sportsman3.setSecondName("Elis");
        sportsman3.setThirdName("Lingard");
        sportsman3.setSport(football);
        sportsman3.setLineup(0);
        sportsman3.setPosition(1);
        sportsman3.setRank(3);
        sportsman3.setTitleNumber(10);


        sportsmanInfoData.addSportsman(sportsman);
        sportsmanInfoData.addSportsman(sportsman1);
        sportsmanInfoData.addSportsman(sportsman2);
        sportsmanInfoData.addSportsman(sportsman3);


/*        sportsmanList.add(sportsman);
        sportsmanList.add(sportsman1);
        sportsmanList.add(sportsman2);
        sportsmanList.add(sportsman3);*/


       // tablePanel = new JScrollPane(new JTable(new TableModelWithSportsman(sportsmanList)));

        mainFrame = new MainFrame(this);
        mainFrame.setVisible(true);

        //mainFrame.revalidate();


    }


/*
    public void exit(JFrame frame) {

    }
*/
    public void deleteFIOSport(String name, String secondName, String thirdname, Sport sport){
        sportsmanInfoData.deleteSportsman(name, secondName, thirdname, sport);
        refreshMainFrame();
    }

    public void deleteTitle(int lower, int upper){
        sportsmanInfoData.deleteSportsman(lower, upper);
        refreshMainFrame();
    }


    public void addSport(String name, String[] positions){
        sportsmanInfoData.addSport(new Sport(name, positions));
        //mainFrame.revalidate();
    }
    public void addSportsman(Sportsman sportsman) {
        sportsmanInfoData.addSportsman(sportsman);
        refreshMainFrame();
    }

/*
    public void refreshTableMainPage(JScrollPane panel){
        panel = new JScrollPane(new JTable(new TableModelWithSportsman(sportsmanList)));
        mainFrame.revalidate();
    }

    public void openDialogAddingSportsman() {
        AddSportsmanDialog addDialog = new AddSportsmanDialog(this, sportList);
    }

*/

    public void refreshMainFrame(){
        mainFrame.refreshTable();
    }

    public SportsmanInfoData getSportsmanInfoData() {
        return sportsmanInfoData;
    }
}