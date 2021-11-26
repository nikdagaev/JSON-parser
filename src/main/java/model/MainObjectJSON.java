
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TABS",
    "ALERTS",
    "MARKET_TABS",
    "DIRECT",
    "BUTTONS",
    "PARLAY",
    "LOGIN",
    "REGISTRATION",
    "MORE",
    "ACTIVITY",
    "ACTIVITY_INFO",
    "MAP",
    "STADIUM_MODAL",
    "CALENDAR",
    "MY_BETS",
    "ERRORS",
    "QUICK_BET",
    "LIVE_SPORT_TABS",
    "LIVE",
    "SWARM_BET_TYPES_ROLL",
    "SET_TIME_FOR_SPORT",
    "QUARTERS_MATCH_INFO",
    "BET_SLIP_PANEL",
    "BET_SLIP",
    "GAME",
    "RECOMMENDS_CARD",
    "ACHIEVEMENTS_MODAL",
    "MENU_MODAL",
    "ODDS_CHANGES",
    "CASHOUT_CHANGES",
    "BET_CARD",
    "BET_ERRORS",
    "PARLAY_CARD",
    "DEPOSIT",
    "HELP_COMPONENT"
})
@Generated("jsonschema2pojo")
@ToString
public class MainObjectJSON {

    @JsonProperty("TABS")
    private Tabs tabs;
    @JsonProperty("ALERTS")
    private Alerts alerts;
    @JsonProperty("MARKET_TABS")
    private MarketTabs marketTabs;
    @JsonProperty("DIRECT")
    private Direct direct;
    @JsonProperty("BUTTONS")
    private Buttons buttons;
    @JsonProperty("PARLAY")
    private Parlay parlay;
    @JsonProperty("LOGIN")
    private Login login;
    @JsonProperty("REGISTRATION")
    private Registration registration;
    @JsonProperty("MORE")
    private More more;
    @JsonProperty("ACTIVITY")
    private Activity activity;
    @JsonProperty("ACTIVITY_INFO")
    private ActivityInfo activityInfo;
    @JsonProperty("MAP")
    private Map map;
    @JsonProperty("STADIUM_MODAL")
    private StadiumModal stadiumModal;
    @JsonProperty("CALENDAR")
    private Calendar calendar;
    @JsonProperty("MY_BETS")
    private MyBets myBets;
    @JsonProperty("ERRORS")
    private Errors__1 errors;
    @JsonProperty("QUICK_BET")
    private QuickBet quickBet;
    @JsonProperty("LIVE_SPORT_TABS")
    private LiveSportTabs liveSportTabs;
    @JsonProperty("LIVE")
    private Live live;
    @JsonProperty("SWARM_BET_TYPES_ROLL")
    private SwarmBetTypesRoll swarmBetTypesRoll;
    @JsonProperty("SET_TIME_FOR_SPORT")
    private SetTimeForSport setTimeForSport;
    @JsonProperty("QUARTERS_MATCH_INFO")
    private QuartersMatchInfo quartersMatchInfo;
    @JsonProperty("BET_SLIP_PANEL")
    private BetSlipPanel betSlipPanel;
    @JsonProperty("BET_SLIP")
    private BetSlip betSlip;
    @JsonProperty("GAME")
    private Game game;
    @JsonProperty("RECOMMENDS_CARD")
    private RecommendsCard recommendsCard;
    @JsonProperty("ACHIEVEMENTS_MODAL")
    private AchievementsModal achievementsModal;
    @JsonProperty("MENU_MODAL")
    private MenuModal menuModal;
    @JsonProperty("ODDS_CHANGES")
    private OddsChanges oddsChanges;
    @JsonProperty("CASHOUT_CHANGES")
    private CashoutChanges cashoutChanges;
    @JsonProperty("BET_CARD")
    private BetCard betCard;
    @JsonProperty("BET_ERRORS")
    private BetErrors betErrors;
    @JsonProperty("PARLAY_CARD")
    private ParlayCard parlayCard;
    @JsonProperty("DEPOSIT")
    private Deposit deposit;
    @JsonProperty("HELP_COMPONENT")
    private HelpComponent helpComponent;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TABS")
    public Tabs getTabs() {
        return tabs;
    }

    @JsonProperty("TABS")
    public void setTabs(Tabs tabs) {
        this.tabs = tabs;
    }

    @JsonProperty("ALERTS")
    public Alerts getAlerts() {
        return alerts;
    }

    @JsonProperty("ALERTS")
    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("MARKET_TABS")
    public MarketTabs getMarketTabs() {
        return marketTabs;
    }

    @JsonProperty("MARKET_TABS")
    public void setMarketTabs(MarketTabs marketTabs) {
        this.marketTabs = marketTabs;
    }

    @JsonProperty("DIRECT")
    public Direct getDirect() {
        return direct;
    }

    @JsonProperty("DIRECT")
    public void setDirect(Direct direct) {
        this.direct = direct;
    }

    @JsonProperty("BUTTONS")
    public Buttons getButtons() {
        return buttons;
    }

    @JsonProperty("BUTTONS")
    public void setButtons(Buttons buttons) {
        this.buttons = buttons;
    }

    @JsonProperty("PARLAY")
    public Parlay getParlay() {
        return parlay;
    }

    @JsonProperty("PARLAY")
    public void setParlay(Parlay parlay) {
        this.parlay = parlay;
    }

    @JsonProperty("LOGIN")
    public Login getLogin() {
        return login;
    }

    @JsonProperty("LOGIN")
    public void setLogin(Login login) {
        this.login = login;
    }

    @JsonProperty("REGISTRATION")
    public Registration getRegistration() {
        return registration;
    }

    @JsonProperty("REGISTRATION")
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    @JsonProperty("MORE")
    public More getMore() {
        return more;
    }

    @JsonProperty("MORE")
    public void setMore(More more) {
        this.more = more;
    }

    @JsonProperty("ACTIVITY")
    public Activity getActivity() {
        return activity;
    }

    @JsonProperty("ACTIVITY")
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @JsonProperty("ACTIVITY_INFO")
    public ActivityInfo getActivityInfo() {
        return activityInfo;
    }

    @JsonProperty("ACTIVITY_INFO")
    public void setActivityInfo(ActivityInfo activityInfo) {
        this.activityInfo = activityInfo;
    }

    @JsonProperty("MAP")
    public Map getMap() {
        return map;
    }

    @JsonProperty("MAP")
    public void setMap(Map map) {
        this.map = map;
    }

    @JsonProperty("STADIUM_MODAL")
    public StadiumModal getStadiumModal() {
        return stadiumModal;
    }

    @JsonProperty("STADIUM_MODAL")
    public void setStadiumModal(StadiumModal stadiumModal) {
        this.stadiumModal = stadiumModal;
    }

    @JsonProperty("CALENDAR")
    public Calendar getCalendar() {
        return calendar;
    }

    @JsonProperty("CALENDAR")
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @JsonProperty("MY_BETS")
    public MyBets getMyBets() {
        return myBets;
    }

    @JsonProperty("MY_BETS")
    public void setMyBets(MyBets myBets) {
        this.myBets = myBets;
    }

    @JsonProperty("ERRORS")
    public Errors__1 getErrors() {
        return errors;
    }

    @JsonProperty("ERRORS")
    public void setErrors(Errors__1 errors) {
        this.errors = errors;
    }

    @JsonProperty("QUICK_BET")
    public QuickBet getQuickBet() {
        return quickBet;
    }

    @JsonProperty("QUICK_BET")
    public void setQuickBet(QuickBet quickBet) {
        this.quickBet = quickBet;
    }

    @JsonProperty("LIVE_SPORT_TABS")
    public LiveSportTabs getLiveSportTabs() {
        return liveSportTabs;
    }

    @JsonProperty("LIVE_SPORT_TABS")
    public void setLiveSportTabs(LiveSportTabs liveSportTabs) {
        this.liveSportTabs = liveSportTabs;
    }

    @JsonProperty("LIVE")
    public Live getLive() {
        return live;
    }

    @JsonProperty("LIVE")
    public void setLive(Live live) {
        this.live = live;
    }

    @JsonProperty("SWARM_BET_TYPES_ROLL")
    public SwarmBetTypesRoll getSwarmBetTypesRoll() {
        return swarmBetTypesRoll;
    }

    @JsonProperty("SWARM_BET_TYPES_ROLL")
    public void setSwarmBetTypesRoll(SwarmBetTypesRoll swarmBetTypesRoll) {
        this.swarmBetTypesRoll = swarmBetTypesRoll;
    }

    @JsonProperty("SET_TIME_FOR_SPORT")
    public SetTimeForSport getSetTimeForSport() {
        return setTimeForSport;
    }

    @JsonProperty("SET_TIME_FOR_SPORT")
    public void setSetTimeForSport(SetTimeForSport setTimeForSport) {
        this.setTimeForSport = setTimeForSport;
    }

    @JsonProperty("QUARTERS_MATCH_INFO")
    public QuartersMatchInfo getQuartersMatchInfo() {
        return quartersMatchInfo;
    }

    @JsonProperty("QUARTERS_MATCH_INFO")
    public void setQuartersMatchInfo(QuartersMatchInfo quartersMatchInfo) {
        this.quartersMatchInfo = quartersMatchInfo;
    }

    @JsonProperty("BET_SLIP_PANEL")
    public BetSlipPanel getBetSlipPanel() {
        return betSlipPanel;
    }

    @JsonProperty("BET_SLIP_PANEL")
    public void setBetSlipPanel(BetSlipPanel betSlipPanel) {
        this.betSlipPanel = betSlipPanel;
    }

    @JsonProperty("BET_SLIP")
    public BetSlip getBetSlip() {
        return betSlip;
    }

    @JsonProperty("BET_SLIP")
    public void setBetSlip(BetSlip betSlip) {
        this.betSlip = betSlip;
    }

    @JsonProperty("GAME")
    public Game getGame() {
        return game;
    }

    @JsonProperty("GAME")
    public void setGame(Game game) {
        this.game = game;
    }

    @JsonProperty("RECOMMENDS_CARD")
    public RecommendsCard getRecommendsCard() {
        return recommendsCard;
    }

    @JsonProperty("RECOMMENDS_CARD")
    public void setRecommendsCard(RecommendsCard recommendsCard) {
        this.recommendsCard = recommendsCard;
    }

    @JsonProperty("ACHIEVEMENTS_MODAL")
    public AchievementsModal getAchievementsModal() {
        return achievementsModal;
    }

    @JsonProperty("ACHIEVEMENTS_MODAL")
    public void setAchievementsModal(AchievementsModal achievementsModal) {
        this.achievementsModal = achievementsModal;
    }

    @JsonProperty("MENU_MODAL")
    public MenuModal getMenuModal() {
        return menuModal;
    }

    @JsonProperty("MENU_MODAL")
    public void setMenuModal(MenuModal menuModal) {
        this.menuModal = menuModal;
    }

    @JsonProperty("ODDS_CHANGES")
    public OddsChanges getOddsChanges() {
        return oddsChanges;
    }

    @JsonProperty("ODDS_CHANGES")
    public void setOddsChanges(OddsChanges oddsChanges) {
        this.oddsChanges = oddsChanges;
    }

    @JsonProperty("CASHOUT_CHANGES")
    public CashoutChanges getCashoutChanges() {
        return cashoutChanges;
    }

    @JsonProperty("CASHOUT_CHANGES")
    public void setCashoutChanges(CashoutChanges cashoutChanges) {
        this.cashoutChanges = cashoutChanges;
    }

    @JsonProperty("BET_CARD")
    public BetCard getBetCard() {
        return betCard;
    }

    @JsonProperty("BET_CARD")
    public void setBetCard(BetCard betCard) {
        this.betCard = betCard;
    }

    @JsonProperty("BET_ERRORS")
    public BetErrors getBetErrors() {
        return betErrors;
    }

    @JsonProperty("BET_ERRORS")
    public void setBetErrors(BetErrors betErrors) {
        this.betErrors = betErrors;
    }

    @JsonProperty("PARLAY_CARD")
    public ParlayCard getParlayCard() {
        return parlayCard;
    }

    @JsonProperty("PARLAY_CARD")
    public void setParlayCard(ParlayCard parlayCard) {
        this.parlayCard = parlayCard;
    }

    @JsonProperty("DEPOSIT")
    public Deposit getDeposit() {
        return deposit;
    }

    @JsonProperty("DEPOSIT")
    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    @JsonProperty("HELP_COMPONENT")
    public HelpComponent getHelpComponent() {
        return helpComponent;
    }

    @JsonProperty("HELP_COMPONENT")
    public void setHelpComponent(HelpComponent helpComponent) {
        this.helpComponent = helpComponent;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
