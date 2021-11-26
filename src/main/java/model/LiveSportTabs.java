
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "POPULAR",
    "FOOTBALL",
    "ICE_HOCKEY",
    "BASKETBALL",
    "TENNIS",
    "VOLLEYBALL",
    "AMERICAN_FOOTBALL",
    "ATHLETICS",
    "AUSSIE_RULES",
    "BADMINTON",
    "BANDY",
    "BASEBALL",
    "BEACH_FOOTBALL",
    "BEACH_HANDBALL",
    "BEACH_VOLLEYBALL",
    "BIATHLON",
    "BOWLS",
    "BOXING",
    "CHESS",
    "CRICKET",
    "CURLING",
    "CYCLING",
    "DARTS",
    "DIVING",
    "FLOORBALL",
    "FORMULA_1",
    "FUTSAL",
    "GOLF",
    "GYMNASTICS",
    "HANDBALL",
    "FIELD_HOCKEY",
    "HORSE_RACING",
    "MOTORBIKES",
    "NASCAR",
    "POOL",
    "RALLY",
    "RUGBY_LEAGUE",
    "RUGBY_UNION",
    "SHOOTING",
    "SNOOKER",
    "SWIMMING",
    "TABLE_TENNIS",
    "WATER_POLO",
    "ELECTRONIC_SPORTS",
    "MMA",
    "VIRTUAL_SPORTS",
    "VIRTUAL_HORSE_RACING",
    "VIRTUAL_GREYHOUNDS",
    "VIRTUAL_TENNIS",
    "VIRTUAL_FOOTBALL",
    "GAELIC_FOOTBALL",
    "HURLING",
    "E_FOOTBALL",
    "SURFING",
    "E_BASKETBALL",
    "CALL_OF_DUTY",
    "COUNTER_STRIKE_GO",
    "DOTA_2",
    "LEAGUE_OF_LEGENDS",
    "HEARTHSTONE",
    "HEROES_OF_THE_STORM",
    "OVERWATCH",
    "SMITE",
    "STARCRAFT",
    "STARCRAFT_2",
    "WORLD_OF_WARCRAFT",
    "WORLD_OF_TANKS",
    "SUMO",
    "SPEEDWAY",
    "SQUASH",
    "POLITICS",
    "SPECIAL_BETS",
    "ENTERTAINMENT",
    "OSCAR",
    "EUROVISION",
    "WHAT_WHERE_WHEN",
    "RUGBY_SEVENS",
    "CROSS_COUNTRY_SKIING",
    "SHORT_TRACK_SPEED_SKATING",
    "FREESTYLE_SKIING",
    "LUGE",
    "FIGURE_SKATING",
    "AUTO_RACING",
    "ALPINE_SKIING",
    "SNOWBOARDING",
    "PESAPALLO",
    "EXTREME_SPORT",
    "SKI_JUMPING",
    "TRIATHLON",
    "NETBALL",
    "POKER",
    "LACROSSE",
    "ROWING",
    "SAILING",
    "WWE",
    "FREESTYLE_WRESTLING",
    "GRECO_ROMAN_WRESTLING",
    "RINK_HOCKEY",
    "INLINE_HOCKEY",
    "VIRTUAL_CAR_RACING",
    "OLYMPICS",
    "VAINGLORY",
    "WEIGHTLIFTING",
    "SYNCHRONISED_SWIMMING",
    "HEROES_OF_NEWERTH",
    "ARCHERY",
    "LOTTERY",
    "CANOEING",
    "EQUESTRIAN",
    "FENCING",
    "JUDO",
    "MODERN_PENTATHLON",
    "TAEKWONDO",
    "RUSH_2_FOOTBALL",
    "INSPIRED_HORSE_RACING",
    "MOTOR_RACING",
    "INSPIRED_SPEEDWAY",
    "INSPIRED_CYCLING",
    "GREYHOUND_RACING",
    "INSPIRED_TROTTING",
    "E_TENNIS",
    "CROSSFIRE",
    "HALO",
    "FIFA",
    "NORDIC_COMBINED",
    "GEARS_OF_WAR",
    "INDOOR_HOCKEY",
    "CLASH_ROYALE",
    "TV_SHOWS_AND_MOVIES",
    "MIXED_FOOTBALL",
    "STREET_FIGHTER_V",
    "VIRTUAL_BICYCLE",
    "SKELETON",
    "BOBSLEIGH",
    "TROTTING",
    "MORTAL_KOMBAT_XL",
    "ROCKET_LEAGUE",
    "KING_OF_GLORY",
    "BETONPOKER",
    "BETONBLACKJACK",
    "LIVEBETONPOKER",
    "LIVEBETONBACCARAT",
    "QUAKE",
    "PUBG",
    "KABADDI",
    "UFC_2",
    "STREET_FIGHTER",
    "TEKKEN_7",
    "WARCRAFT_III",
    "INTERNATIONAL_RULES",
    "BASKETBALL_SHOTS"
})
@Generated("jsonschema2pojo")
@ToString
public class LiveSportTabs {

    @JsonProperty("POPULAR")
    private String popular;
    @JsonProperty("FOOTBALL")
    private String football;
    @JsonProperty("ICE_HOCKEY")
    private String iceHockey;
    @JsonProperty("BASKETBALL")
    private String basketball;
    @JsonProperty("TENNIS")
    private String tennis;
    @JsonProperty("VOLLEYBALL")
    private String volleyball;
    @JsonProperty("AMERICAN_FOOTBALL")
    private String americanFootball;
    @JsonProperty("ATHLETICS")
    private String athletics;
    @JsonProperty("AUSSIE_RULES")
    private String aussieRules;
    @JsonProperty("BADMINTON")
    private String badminton;
    @JsonProperty("BANDY")
    private String bandy;
    @JsonProperty("BASEBALL")
    private String baseball;
    @JsonProperty("BEACH_FOOTBALL")
    private String beachFootball;
    @JsonProperty("BEACH_HANDBALL")
    private String beachHandball;
    @JsonProperty("BEACH_VOLLEYBALL")
    private String beachVolleyball;
    @JsonProperty("BIATHLON")
    private String biathlon;
    @JsonProperty("BOWLS")
    private String bowls;
    @JsonProperty("BOXING")
    private String boxing;
    @JsonProperty("CHESS")
    private String chess;
    @JsonProperty("CRICKET")
    private String cricket;
    @JsonProperty("CURLING")
    private String curling;
    @JsonProperty("CYCLING")
    private String cycling;
    @JsonProperty("DARTS")
    private String darts;
    @JsonProperty("DIVING")
    private String diving;
    @JsonProperty("FLOORBALL")
    private String floorball;
    @JsonProperty("FORMULA_1")
    private String formula1;
    @JsonProperty("FUTSAL")
    private String futsal;
    @JsonProperty("GOLF")
    private String golf;
    @JsonProperty("GYMNASTICS")
    private String gymnastics;
    @JsonProperty("HANDBALL")
    private String handball;
    @JsonProperty("FIELD_HOCKEY")
    private String fieldHockey;
    @JsonProperty("HORSE_RACING")
    private String horseRacing;
    @JsonProperty("MOTORBIKES")
    private String motorbikes;
    @JsonProperty("NASCAR")
    private String nascar;
    @JsonProperty("POOL")
    private String pool;
    @JsonProperty("RALLY")
    private String rally;
    @JsonProperty("RUGBY_LEAGUE")
    private String rugbyLeague;
    @JsonProperty("RUGBY_UNION")
    private String rugbyUnion;
    @JsonProperty("SHOOTING")
    private String shooting;
    @JsonProperty("SNOOKER")
    private String snooker;
    @JsonProperty("SWIMMING")
    private String swimming;
    @JsonProperty("TABLE_TENNIS")
    private String tableTennis;
    @JsonProperty("WATER_POLO")
    private String waterPolo;
    @JsonProperty("ELECTRONIC_SPORTS")
    private String electronicSports;
    @JsonProperty("MMA")
    private String mma;
    @JsonProperty("VIRTUAL_SPORTS")
    private String virtualSports;
    @JsonProperty("VIRTUAL_HORSE_RACING")
    private String virtualHorseRacing;
    @JsonProperty("VIRTUAL_GREYHOUNDS")
    private String virtualGreyhounds;
    @JsonProperty("VIRTUAL_TENNIS")
    private String virtualTennis;
    @JsonProperty("VIRTUAL_FOOTBALL")
    private String virtualFootball;
    @JsonProperty("GAELIC_FOOTBALL")
    private String gaelicFootball;
    @JsonProperty("HURLING")
    private String hurling;
    @JsonProperty("E_FOOTBALL")
    private String eFootball;
    @JsonProperty("SURFING")
    private String surfing;
    @JsonProperty("E_BASKETBALL")
    private String eBasketball;
    @JsonProperty("CALL_OF_DUTY")
    private String callOfDuty;
    @JsonProperty("COUNTER_STRIKE_GO")
    private String counterStrikeGo;
    @JsonProperty("DOTA_2")
    private String dota2;
    @JsonProperty("LEAGUE_OF_LEGENDS")
    private String leagueOfLegends;
    @JsonProperty("HEARTHSTONE")
    private String hearthstone;
    @JsonProperty("HEROES_OF_THE_STORM")
    private String heroesOfTheStorm;
    @JsonProperty("OVERWATCH")
    private String overwatch;
    @JsonProperty("SMITE")
    private String smite;
    @JsonProperty("STARCRAFT")
    private String starcraft;
    @JsonProperty("STARCRAFT_2")
    private String starcraft2;
    @JsonProperty("WORLD_OF_WARCRAFT")
    private String worldOfWarcraft;
    @JsonProperty("WORLD_OF_TANKS")
    private String worldOfTanks;
    @JsonProperty("SUMO")
    private String sumo;
    @JsonProperty("SPEEDWAY")
    private String speedway;
    @JsonProperty("SQUASH")
    private String squash;
    @JsonProperty("POLITICS")
    private String politics;
    @JsonProperty("SPECIAL_BETS")
    private String specialBets;
    @JsonProperty("ENTERTAINMENT")
    private String entertainment;
    @JsonProperty("OSCAR")
    private String oscar;
    @JsonProperty("EUROVISION")
    private String eurovision;
    @JsonProperty("WHAT_WHERE_WHEN")
    private String whatWhereWhen;
    @JsonProperty("RUGBY_SEVENS")
    private String rugbySevens;
    @JsonProperty("CROSS_COUNTRY_SKIING")
    private String crossCountrySkiing;
    @JsonProperty("SHORT_TRACK_SPEED_SKATING")
    private String shortTrackSpeedSkating;
    @JsonProperty("FREESTYLE_SKIING")
    private String freestyleSkiing;
    @JsonProperty("LUGE")
    private String luge;
    @JsonProperty("FIGURE_SKATING")
    private String figureSkating;
    @JsonProperty("AUTO_RACING")
    private String autoRacing;
    @JsonProperty("ALPINE_SKIING")
    private String alpineSkiing;
    @JsonProperty("SNOWBOARDING")
    private String snowboarding;
    @JsonProperty("PESAPALLO")
    private String pesapallo;
    @JsonProperty("EXTREME_SPORT")
    private String extremeSport;
    @JsonProperty("SKI_JUMPING")
    private String skiJumping;
    @JsonProperty("TRIATHLON")
    private String triathlon;
    @JsonProperty("NETBALL")
    private String netball;
    @JsonProperty("POKER")
    private String poker;
    @JsonProperty("LACROSSE")
    private String lacrosse;
    @JsonProperty("ROWING")
    private String rowing;
    @JsonProperty("SAILING")
    private String sailing;
    @JsonProperty("WWE")
    private String wwe;
    @JsonProperty("FREESTYLE_WRESTLING")
    private String freestyleWrestling;
    @JsonProperty("GRECO_ROMAN_WRESTLING")
    private String grecoRomanWrestling;
    @JsonProperty("RINK_HOCKEY")
    private String rinkHockey;
    @JsonProperty("INLINE_HOCKEY")
    private String inlineHockey;
    @JsonProperty("VIRTUAL_CAR_RACING")
    private String virtualCarRacing;
    @JsonProperty("OLYMPICS")
    private String olympics;
    @JsonProperty("VAINGLORY")
    private String vainglory;
    @JsonProperty("WEIGHTLIFTING")
    private String weightlifting;
    @JsonProperty("SYNCHRONISED_SWIMMING")
    private String synchronisedSwimming;
    @JsonProperty("HEROES_OF_NEWERTH")
    private String heroesOfNewerth;
    @JsonProperty("ARCHERY")
    private String archery;
    @JsonProperty("LOTTERY")
    private String lottery;
    @JsonProperty("CANOEING")
    private String canoeing;
    @JsonProperty("EQUESTRIAN")
    private String equestrian;
    @JsonProperty("FENCING")
    private String fencing;
    @JsonProperty("JUDO")
    private String judo;
    @JsonProperty("MODERN_PENTATHLON")
    private String modernPentathlon;
    @JsonProperty("TAEKWONDO")
    private String taekwondo;
    @JsonProperty("RUSH_2_FOOTBALL")
    private String rush2Football;
    @JsonProperty("INSPIRED_HORSE_RACING")
    private String inspiredHorseRacing;
    @JsonProperty("MOTOR_RACING")
    private String motorRacing;
    @JsonProperty("INSPIRED_SPEEDWAY")
    private String inspiredSpeedway;
    @JsonProperty("INSPIRED_CYCLING")
    private String inspiredCycling;
    @JsonProperty("GREYHOUND_RACING")
    private String greyhoundRacing;
    @JsonProperty("INSPIRED_TROTTING")
    private String inspiredTrotting;
    @JsonProperty("E_TENNIS")
    private String eTennis;
    @JsonProperty("CROSSFIRE")
    private String crossfire;
    @JsonProperty("HALO")
    private String halo;
    @JsonProperty("FIFA")
    private String fifa;
    @JsonProperty("NORDIC_COMBINED")
    private String nordicCombined;
    @JsonProperty("GEARS_OF_WAR")
    private String gearsOfWar;
    @JsonProperty("INDOOR_HOCKEY")
    private String indoorHockey;
    @JsonProperty("CLASH_ROYALE")
    private String clashRoyale;
    @JsonProperty("TV_SHOWS_AND_MOVIES")
    private String tvShowsAndMovies;
    @JsonProperty("MIXED_FOOTBALL")
    private String mixedFootball;
    @JsonProperty("STREET_FIGHTER_V")
    private String streetFighterV;
    @JsonProperty("VIRTUAL_BICYCLE")
    private String virtualBicycle;
    @JsonProperty("SKELETON")
    private String skeleton;
    @JsonProperty("BOBSLEIGH")
    private String bobsleigh;
    @JsonProperty("TROTTING")
    private String trotting;
    @JsonProperty("MORTAL_KOMBAT_XL")
    private String mortalKombatXl;
    @JsonProperty("ROCKET_LEAGUE")
    private String rocketLeague;
    @JsonProperty("KING_OF_GLORY")
    private String kingOfGlory;
    @JsonProperty("BETONPOKER")
    private String betonpoker;
    @JsonProperty("BETONBLACKJACK")
    private String betonblackjack;
    @JsonProperty("LIVEBETONPOKER")
    private String livebetonpoker;
    @JsonProperty("LIVEBETONBACCARAT")
    private String livebetonbaccarat;
    @JsonProperty("QUAKE")
    private String quake;
    @JsonProperty("PUBG")
    private String pubg;
    @JsonProperty("KABADDI")
    private String kabaddi;
    @JsonProperty("UFC_2")
    private String ufc2;
    @JsonProperty("STREET_FIGHTER")
    private String streetFighter;
    @JsonProperty("TEKKEN_7")
    private String tekken7;
    @JsonProperty("WARCRAFT_III")
    private String warcraftIii;
    @JsonProperty("INTERNATIONAL_RULES")
    private String internationalRules;
    @JsonProperty("BASKETBALL_SHOTS")
    private String basketballShots;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("POPULAR")
    public String getPopular() {
        return popular;
    }

    @JsonProperty("POPULAR")
    public void setPopular(String popular) {
        this.popular = popular;
    }

    @JsonProperty("FOOTBALL")
    public String getFootball() {
        return football;
    }

    @JsonProperty("FOOTBALL")
    public void setFootball(String football) {
        this.football = football;
    }

    @JsonProperty("ICE_HOCKEY")
    public String getIceHockey() {
        return iceHockey;
    }

    @JsonProperty("ICE_HOCKEY")
    public void setIceHockey(String iceHockey) {
        this.iceHockey = iceHockey;
    }

    @JsonProperty("BASKETBALL")
    public String getBasketball() {
        return basketball;
    }

    @JsonProperty("BASKETBALL")
    public void setBasketball(String basketball) {
        this.basketball = basketball;
    }

    @JsonProperty("TENNIS")
    public String getTennis() {
        return tennis;
    }

    @JsonProperty("TENNIS")
    public void setTennis(String tennis) {
        this.tennis = tennis;
    }

    @JsonProperty("VOLLEYBALL")
    public String getVolleyball() {
        return volleyball;
    }

    @JsonProperty("VOLLEYBALL")
    public void setVolleyball(String volleyball) {
        this.volleyball = volleyball;
    }

    @JsonProperty("AMERICAN_FOOTBALL")
    public String getAmericanFootball() {
        return americanFootball;
    }

    @JsonProperty("AMERICAN_FOOTBALL")
    public void setAmericanFootball(String americanFootball) {
        this.americanFootball = americanFootball;
    }

    @JsonProperty("ATHLETICS")
    public String getAthletics() {
        return athletics;
    }

    @JsonProperty("ATHLETICS")
    public void setAthletics(String athletics) {
        this.athletics = athletics;
    }

    @JsonProperty("AUSSIE_RULES")
    public String getAussieRules() {
        return aussieRules;
    }

    @JsonProperty("AUSSIE_RULES")
    public void setAussieRules(String aussieRules) {
        this.aussieRules = aussieRules;
    }

    @JsonProperty("BADMINTON")
    public String getBadminton() {
        return badminton;
    }

    @JsonProperty("BADMINTON")
    public void setBadminton(String badminton) {
        this.badminton = badminton;
    }

    @JsonProperty("BANDY")
    public String getBandy() {
        return bandy;
    }

    @JsonProperty("BANDY")
    public void setBandy(String bandy) {
        this.bandy = bandy;
    }

    @JsonProperty("BASEBALL")
    public String getBaseball() {
        return baseball;
    }

    @JsonProperty("BASEBALL")
    public void setBaseball(String baseball) {
        this.baseball = baseball;
    }

    @JsonProperty("BEACH_FOOTBALL")
    public String getBeachFootball() {
        return beachFootball;
    }

    @JsonProperty("BEACH_FOOTBALL")
    public void setBeachFootball(String beachFootball) {
        this.beachFootball = beachFootball;
    }

    @JsonProperty("BEACH_HANDBALL")
    public String getBeachHandball() {
        return beachHandball;
    }

    @JsonProperty("BEACH_HANDBALL")
    public void setBeachHandball(String beachHandball) {
        this.beachHandball = beachHandball;
    }

    @JsonProperty("BEACH_VOLLEYBALL")
    public String getBeachVolleyball() {
        return beachVolleyball;
    }

    @JsonProperty("BEACH_VOLLEYBALL")
    public void setBeachVolleyball(String beachVolleyball) {
        this.beachVolleyball = beachVolleyball;
    }

    @JsonProperty("BIATHLON")
    public String getBiathlon() {
        return biathlon;
    }

    @JsonProperty("BIATHLON")
    public void setBiathlon(String biathlon) {
        this.biathlon = biathlon;
    }

    @JsonProperty("BOWLS")
    public String getBowls() {
        return bowls;
    }

    @JsonProperty("BOWLS")
    public void setBowls(String bowls) {
        this.bowls = bowls;
    }

    @JsonProperty("BOXING")
    public String getBoxing() {
        return boxing;
    }

    @JsonProperty("BOXING")
    public void setBoxing(String boxing) {
        this.boxing = boxing;
    }

    @JsonProperty("CHESS")
    public String getChess() {
        return chess;
    }

    @JsonProperty("CHESS")
    public void setChess(String chess) {
        this.chess = chess;
    }

    @JsonProperty("CRICKET")
    public String getCricket() {
        return cricket;
    }

    @JsonProperty("CRICKET")
    public void setCricket(String cricket) {
        this.cricket = cricket;
    }

    @JsonProperty("CURLING")
    public String getCurling() {
        return curling;
    }

    @JsonProperty("CURLING")
    public void setCurling(String curling) {
        this.curling = curling;
    }

    @JsonProperty("CYCLING")
    public String getCycling() {
        return cycling;
    }

    @JsonProperty("CYCLING")
    public void setCycling(String cycling) {
        this.cycling = cycling;
    }

    @JsonProperty("DARTS")
    public String getDarts() {
        return darts;
    }

    @JsonProperty("DARTS")
    public void setDarts(String darts) {
        this.darts = darts;
    }

    @JsonProperty("DIVING")
    public String getDiving() {
        return diving;
    }

    @JsonProperty("DIVING")
    public void setDiving(String diving) {
        this.diving = diving;
    }

    @JsonProperty("FLOORBALL")
    public String getFloorball() {
        return floorball;
    }

    @JsonProperty("FLOORBALL")
    public void setFloorball(String floorball) {
        this.floorball = floorball;
    }

    @JsonProperty("FORMULA_1")
    public String getFormula1() {
        return formula1;
    }

    @JsonProperty("FORMULA_1")
    public void setFormula1(String formula1) {
        this.formula1 = formula1;
    }

    @JsonProperty("FUTSAL")
    public String getFutsal() {
        return futsal;
    }

    @JsonProperty("FUTSAL")
    public void setFutsal(String futsal) {
        this.futsal = futsal;
    }

    @JsonProperty("GOLF")
    public String getGolf() {
        return golf;
    }

    @JsonProperty("GOLF")
    public void setGolf(String golf) {
        this.golf = golf;
    }

    @JsonProperty("GYMNASTICS")
    public String getGymnastics() {
        return gymnastics;
    }

    @JsonProperty("GYMNASTICS")
    public void setGymnastics(String gymnastics) {
        this.gymnastics = gymnastics;
    }

    @JsonProperty("HANDBALL")
    public String getHandball() {
        return handball;
    }

    @JsonProperty("HANDBALL")
    public void setHandball(String handball) {
        this.handball = handball;
    }

    @JsonProperty("FIELD_HOCKEY")
    public String getFieldHockey() {
        return fieldHockey;
    }

    @JsonProperty("FIELD_HOCKEY")
    public void setFieldHockey(String fieldHockey) {
        this.fieldHockey = fieldHockey;
    }

    @JsonProperty("HORSE_RACING")
    public String getHorseRacing() {
        return horseRacing;
    }

    @JsonProperty("HORSE_RACING")
    public void setHorseRacing(String horseRacing) {
        this.horseRacing = horseRacing;
    }

    @JsonProperty("MOTORBIKES")
    public String getMotorbikes() {
        return motorbikes;
    }

    @JsonProperty("MOTORBIKES")
    public void setMotorbikes(String motorbikes) {
        this.motorbikes = motorbikes;
    }

    @JsonProperty("NASCAR")
    public String getNascar() {
        return nascar;
    }

    @JsonProperty("NASCAR")
    public void setNascar(String nascar) {
        this.nascar = nascar;
    }

    @JsonProperty("POOL")
    public String getPool() {
        return pool;
    }

    @JsonProperty("POOL")
    public void setPool(String pool) {
        this.pool = pool;
    }

    @JsonProperty("RALLY")
    public String getRally() {
        return rally;
    }

    @JsonProperty("RALLY")
    public void setRally(String rally) {
        this.rally = rally;
    }

    @JsonProperty("RUGBY_LEAGUE")
    public String getRugbyLeague() {
        return rugbyLeague;
    }

    @JsonProperty("RUGBY_LEAGUE")
    public void setRugbyLeague(String rugbyLeague) {
        this.rugbyLeague = rugbyLeague;
    }

    @JsonProperty("RUGBY_UNION")
    public String getRugbyUnion() {
        return rugbyUnion;
    }

    @JsonProperty("RUGBY_UNION")
    public void setRugbyUnion(String rugbyUnion) {
        this.rugbyUnion = rugbyUnion;
    }

    @JsonProperty("SHOOTING")
    public String getShooting() {
        return shooting;
    }

    @JsonProperty("SHOOTING")
    public void setShooting(String shooting) {
        this.shooting = shooting;
    }

    @JsonProperty("SNOOKER")
    public String getSnooker() {
        return snooker;
    }

    @JsonProperty("SNOOKER")
    public void setSnooker(String snooker) {
        this.snooker = snooker;
    }

    @JsonProperty("SWIMMING")
    public String getSwimming() {
        return swimming;
    }

    @JsonProperty("SWIMMING")
    public void setSwimming(String swimming) {
        this.swimming = swimming;
    }

    @JsonProperty("TABLE_TENNIS")
    public String getTableTennis() {
        return tableTennis;
    }

    @JsonProperty("TABLE_TENNIS")
    public void setTableTennis(String tableTennis) {
        this.tableTennis = tableTennis;
    }

    @JsonProperty("WATER_POLO")
    public String getWaterPolo() {
        return waterPolo;
    }

    @JsonProperty("WATER_POLO")
    public void setWaterPolo(String waterPolo) {
        this.waterPolo = waterPolo;
    }

    @JsonProperty("ELECTRONIC_SPORTS")
    public String getElectronicSports() {
        return electronicSports;
    }

    @JsonProperty("ELECTRONIC_SPORTS")
    public void setElectronicSports(String electronicSports) {
        this.electronicSports = electronicSports;
    }

    @JsonProperty("MMA")
    public String getMma() {
        return mma;
    }

    @JsonProperty("MMA")
    public void setMma(String mma) {
        this.mma = mma;
    }

    @JsonProperty("VIRTUAL_SPORTS")
    public String getVirtualSports() {
        return virtualSports;
    }

    @JsonProperty("VIRTUAL_SPORTS")
    public void setVirtualSports(String virtualSports) {
        this.virtualSports = virtualSports;
    }

    @JsonProperty("VIRTUAL_HORSE_RACING")
    public String getVirtualHorseRacing() {
        return virtualHorseRacing;
    }

    @JsonProperty("VIRTUAL_HORSE_RACING")
    public void setVirtualHorseRacing(String virtualHorseRacing) {
        this.virtualHorseRacing = virtualHorseRacing;
    }

    @JsonProperty("VIRTUAL_GREYHOUNDS")
    public String getVirtualGreyhounds() {
        return virtualGreyhounds;
    }

    @JsonProperty("VIRTUAL_GREYHOUNDS")
    public void setVirtualGreyhounds(String virtualGreyhounds) {
        this.virtualGreyhounds = virtualGreyhounds;
    }

    @JsonProperty("VIRTUAL_TENNIS")
    public String getVirtualTennis() {
        return virtualTennis;
    }

    @JsonProperty("VIRTUAL_TENNIS")
    public void setVirtualTennis(String virtualTennis) {
        this.virtualTennis = virtualTennis;
    }

    @JsonProperty("VIRTUAL_FOOTBALL")
    public String getVirtualFootball() {
        return virtualFootball;
    }

    @JsonProperty("VIRTUAL_FOOTBALL")
    public void setVirtualFootball(String virtualFootball) {
        this.virtualFootball = virtualFootball;
    }

    @JsonProperty("GAELIC_FOOTBALL")
    public String getGaelicFootball() {
        return gaelicFootball;
    }

    @JsonProperty("GAELIC_FOOTBALL")
    public void setGaelicFootball(String gaelicFootball) {
        this.gaelicFootball = gaelicFootball;
    }

    @JsonProperty("HURLING")
    public String getHurling() {
        return hurling;
    }

    @JsonProperty("HURLING")
    public void setHurling(String hurling) {
        this.hurling = hurling;
    }

    @JsonProperty("E_FOOTBALL")
    public String getEFootball() {
        return eFootball;
    }

    @JsonProperty("E_FOOTBALL")
    public void setEFootball(String eFootball) {
        this.eFootball = eFootball;
    }

    @JsonProperty("SURFING")
    public String getSurfing() {
        return surfing;
    }

    @JsonProperty("SURFING")
    public void setSurfing(String surfing) {
        this.surfing = surfing;
    }

    @JsonProperty("E_BASKETBALL")
    public String getEBasketball() {
        return eBasketball;
    }

    @JsonProperty("E_BASKETBALL")
    public void setEBasketball(String eBasketball) {
        this.eBasketball = eBasketball;
    }

    @JsonProperty("CALL_OF_DUTY")
    public String getCallOfDuty() {
        return callOfDuty;
    }

    @JsonProperty("CALL_OF_DUTY")
    public void setCallOfDuty(String callOfDuty) {
        this.callOfDuty = callOfDuty;
    }

    @JsonProperty("COUNTER_STRIKE_GO")
    public String getCounterStrikeGo() {
        return counterStrikeGo;
    }

    @JsonProperty("COUNTER_STRIKE_GO")
    public void setCounterStrikeGo(String counterStrikeGo) {
        this.counterStrikeGo = counterStrikeGo;
    }

    @JsonProperty("DOTA_2")
    public String getDota2() {
        return dota2;
    }

    @JsonProperty("DOTA_2")
    public void setDota2(String dota2) {
        this.dota2 = dota2;
    }

    @JsonProperty("LEAGUE_OF_LEGENDS")
    public String getLeagueOfLegends() {
        return leagueOfLegends;
    }

    @JsonProperty("LEAGUE_OF_LEGENDS")
    public void setLeagueOfLegends(String leagueOfLegends) {
        this.leagueOfLegends = leagueOfLegends;
    }

    @JsonProperty("HEARTHSTONE")
    public String getHearthstone() {
        return hearthstone;
    }

    @JsonProperty("HEARTHSTONE")
    public void setHearthstone(String hearthstone) {
        this.hearthstone = hearthstone;
    }

    @JsonProperty("HEROES_OF_THE_STORM")
    public String getHeroesOfTheStorm() {
        return heroesOfTheStorm;
    }

    @JsonProperty("HEROES_OF_THE_STORM")
    public void setHeroesOfTheStorm(String heroesOfTheStorm) {
        this.heroesOfTheStorm = heroesOfTheStorm;
    }

    @JsonProperty("OVERWATCH")
    public String getOverwatch() {
        return overwatch;
    }

    @JsonProperty("OVERWATCH")
    public void setOverwatch(String overwatch) {
        this.overwatch = overwatch;
    }

    @JsonProperty("SMITE")
    public String getSmite() {
        return smite;
    }

    @JsonProperty("SMITE")
    public void setSmite(String smite) {
        this.smite = smite;
    }

    @JsonProperty("STARCRAFT")
    public String getStarcraft() {
        return starcraft;
    }

    @JsonProperty("STARCRAFT")
    public void setStarcraft(String starcraft) {
        this.starcraft = starcraft;
    }

    @JsonProperty("STARCRAFT_2")
    public String getStarcraft2() {
        return starcraft2;
    }

    @JsonProperty("STARCRAFT_2")
    public void setStarcraft2(String starcraft2) {
        this.starcraft2 = starcraft2;
    }

    @JsonProperty("WORLD_OF_WARCRAFT")
    public String getWorldOfWarcraft() {
        return worldOfWarcraft;
    }

    @JsonProperty("WORLD_OF_WARCRAFT")
    public void setWorldOfWarcraft(String worldOfWarcraft) {
        this.worldOfWarcraft = worldOfWarcraft;
    }

    @JsonProperty("WORLD_OF_TANKS")
    public String getWorldOfTanks() {
        return worldOfTanks;
    }

    @JsonProperty("WORLD_OF_TANKS")
    public void setWorldOfTanks(String worldOfTanks) {
        this.worldOfTanks = worldOfTanks;
    }

    @JsonProperty("SUMO")
    public String getSumo() {
        return sumo;
    }

    @JsonProperty("SUMO")
    public void setSumo(String sumo) {
        this.sumo = sumo;
    }

    @JsonProperty("SPEEDWAY")
    public String getSpeedway() {
        return speedway;
    }

    @JsonProperty("SPEEDWAY")
    public void setSpeedway(String speedway) {
        this.speedway = speedway;
    }

    @JsonProperty("SQUASH")
    public String getSquash() {
        return squash;
    }

    @JsonProperty("SQUASH")
    public void setSquash(String squash) {
        this.squash = squash;
    }

    @JsonProperty("POLITICS")
    public String getPolitics() {
        return politics;
    }

    @JsonProperty("POLITICS")
    public void setPolitics(String politics) {
        this.politics = politics;
    }

    @JsonProperty("SPECIAL_BETS")
    public String getSpecialBets() {
        return specialBets;
    }

    @JsonProperty("SPECIAL_BETS")
    public void setSpecialBets(String specialBets) {
        this.specialBets = specialBets;
    }

    @JsonProperty("ENTERTAINMENT")
    public String getEntertainment() {
        return entertainment;
    }

    @JsonProperty("ENTERTAINMENT")
    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }

    @JsonProperty("OSCAR")
    public String getOscar() {
        return oscar;
    }

    @JsonProperty("OSCAR")
    public void setOscar(String oscar) {
        this.oscar = oscar;
    }

    @JsonProperty("EUROVISION")
    public String getEurovision() {
        return eurovision;
    }

    @JsonProperty("EUROVISION")
    public void setEurovision(String eurovision) {
        this.eurovision = eurovision;
    }

    @JsonProperty("WHAT_WHERE_WHEN")
    public String getWhatWhereWhen() {
        return whatWhereWhen;
    }

    @JsonProperty("WHAT_WHERE_WHEN")
    public void setWhatWhereWhen(String whatWhereWhen) {
        this.whatWhereWhen = whatWhereWhen;
    }

    @JsonProperty("RUGBY_SEVENS")
    public String getRugbySevens() {
        return rugbySevens;
    }

    @JsonProperty("RUGBY_SEVENS")
    public void setRugbySevens(String rugbySevens) {
        this.rugbySevens = rugbySevens;
    }

    @JsonProperty("CROSS_COUNTRY_SKIING")
    public String getCrossCountrySkiing() {
        return crossCountrySkiing;
    }

    @JsonProperty("CROSS_COUNTRY_SKIING")
    public void setCrossCountrySkiing(String crossCountrySkiing) {
        this.crossCountrySkiing = crossCountrySkiing;
    }

    @JsonProperty("SHORT_TRACK_SPEED_SKATING")
    public String getShortTrackSpeedSkating() {
        return shortTrackSpeedSkating;
    }

    @JsonProperty("SHORT_TRACK_SPEED_SKATING")
    public void setShortTrackSpeedSkating(String shortTrackSpeedSkating) {
        this.shortTrackSpeedSkating = shortTrackSpeedSkating;
    }

    @JsonProperty("FREESTYLE_SKIING")
    public String getFreestyleSkiing() {
        return freestyleSkiing;
    }

    @JsonProperty("FREESTYLE_SKIING")
    public void setFreestyleSkiing(String freestyleSkiing) {
        this.freestyleSkiing = freestyleSkiing;
    }

    @JsonProperty("LUGE")
    public String getLuge() {
        return luge;
    }

    @JsonProperty("LUGE")
    public void setLuge(String luge) {
        this.luge = luge;
    }

    @JsonProperty("FIGURE_SKATING")
    public String getFigureSkating() {
        return figureSkating;
    }

    @JsonProperty("FIGURE_SKATING")
    public void setFigureSkating(String figureSkating) {
        this.figureSkating = figureSkating;
    }

    @JsonProperty("AUTO_RACING")
    public String getAutoRacing() {
        return autoRacing;
    }

    @JsonProperty("AUTO_RACING")
    public void setAutoRacing(String autoRacing) {
        this.autoRacing = autoRacing;
    }

    @JsonProperty("ALPINE_SKIING")
    public String getAlpineSkiing() {
        return alpineSkiing;
    }

    @JsonProperty("ALPINE_SKIING")
    public void setAlpineSkiing(String alpineSkiing) {
        this.alpineSkiing = alpineSkiing;
    }

    @JsonProperty("SNOWBOARDING")
    public String getSnowboarding() {
        return snowboarding;
    }

    @JsonProperty("SNOWBOARDING")
    public void setSnowboarding(String snowboarding) {
        this.snowboarding = snowboarding;
    }

    @JsonProperty("PESAPALLO")
    public String getPesapallo() {
        return pesapallo;
    }

    @JsonProperty("PESAPALLO")
    public void setPesapallo(String pesapallo) {
        this.pesapallo = pesapallo;
    }

    @JsonProperty("EXTREME_SPORT")
    public String getExtremeSport() {
        return extremeSport;
    }

    @JsonProperty("EXTREME_SPORT")
    public void setExtremeSport(String extremeSport) {
        this.extremeSport = extremeSport;
    }

    @JsonProperty("SKI_JUMPING")
    public String getSkiJumping() {
        return skiJumping;
    }

    @JsonProperty("SKI_JUMPING")
    public void setSkiJumping(String skiJumping) {
        this.skiJumping = skiJumping;
    }

    @JsonProperty("TRIATHLON")
    public String getTriathlon() {
        return triathlon;
    }

    @JsonProperty("TRIATHLON")
    public void setTriathlon(String triathlon) {
        this.triathlon = triathlon;
    }

    @JsonProperty("NETBALL")
    public String getNetball() {
        return netball;
    }

    @JsonProperty("NETBALL")
    public void setNetball(String netball) {
        this.netball = netball;
    }

    @JsonProperty("POKER")
    public String getPoker() {
        return poker;
    }

    @JsonProperty("POKER")
    public void setPoker(String poker) {
        this.poker = poker;
    }

    @JsonProperty("LACROSSE")
    public String getLacrosse() {
        return lacrosse;
    }

    @JsonProperty("LACROSSE")
    public void setLacrosse(String lacrosse) {
        this.lacrosse = lacrosse;
    }

    @JsonProperty("ROWING")
    public String getRowing() {
        return rowing;
    }

    @JsonProperty("ROWING")
    public void setRowing(String rowing) {
        this.rowing = rowing;
    }

    @JsonProperty("SAILING")
    public String getSailing() {
        return sailing;
    }

    @JsonProperty("SAILING")
    public void setSailing(String sailing) {
        this.sailing = sailing;
    }

    @JsonProperty("WWE")
    public String getWwe() {
        return wwe;
    }

    @JsonProperty("WWE")
    public void setWwe(String wwe) {
        this.wwe = wwe;
    }

    @JsonProperty("FREESTYLE_WRESTLING")
    public String getFreestyleWrestling() {
        return freestyleWrestling;
    }

    @JsonProperty("FREESTYLE_WRESTLING")
    public void setFreestyleWrestling(String freestyleWrestling) {
        this.freestyleWrestling = freestyleWrestling;
    }

    @JsonProperty("GRECO_ROMAN_WRESTLING")
    public String getGrecoRomanWrestling() {
        return grecoRomanWrestling;
    }

    @JsonProperty("GRECO_ROMAN_WRESTLING")
    public void setGrecoRomanWrestling(String grecoRomanWrestling) {
        this.grecoRomanWrestling = grecoRomanWrestling;
    }

    @JsonProperty("RINK_HOCKEY")
    public String getRinkHockey() {
        return rinkHockey;
    }

    @JsonProperty("RINK_HOCKEY")
    public void setRinkHockey(String rinkHockey) {
        this.rinkHockey = rinkHockey;
    }

    @JsonProperty("INLINE_HOCKEY")
    public String getInlineHockey() {
        return inlineHockey;
    }

    @JsonProperty("INLINE_HOCKEY")
    public void setInlineHockey(String inlineHockey) {
        this.inlineHockey = inlineHockey;
    }

    @JsonProperty("VIRTUAL_CAR_RACING")
    public String getVirtualCarRacing() {
        return virtualCarRacing;
    }

    @JsonProperty("VIRTUAL_CAR_RACING")
    public void setVirtualCarRacing(String virtualCarRacing) {
        this.virtualCarRacing = virtualCarRacing;
    }

    @JsonProperty("OLYMPICS")
    public String getOlympics() {
        return olympics;
    }

    @JsonProperty("OLYMPICS")
    public void setOlympics(String olympics) {
        this.olympics = olympics;
    }

    @JsonProperty("VAINGLORY")
    public String getVainglory() {
        return vainglory;
    }

    @JsonProperty("VAINGLORY")
    public void setVainglory(String vainglory) {
        this.vainglory = vainglory;
    }

    @JsonProperty("WEIGHTLIFTING")
    public String getWeightlifting() {
        return weightlifting;
    }

    @JsonProperty("WEIGHTLIFTING")
    public void setWeightlifting(String weightlifting) {
        this.weightlifting = weightlifting;
    }

    @JsonProperty("SYNCHRONISED_SWIMMING")
    public String getSynchronisedSwimming() {
        return synchronisedSwimming;
    }

    @JsonProperty("SYNCHRONISED_SWIMMING")
    public void setSynchronisedSwimming(String synchronisedSwimming) {
        this.synchronisedSwimming = synchronisedSwimming;
    }

    @JsonProperty("HEROES_OF_NEWERTH")
    public String getHeroesOfNewerth() {
        return heroesOfNewerth;
    }

    @JsonProperty("HEROES_OF_NEWERTH")
    public void setHeroesOfNewerth(String heroesOfNewerth) {
        this.heroesOfNewerth = heroesOfNewerth;
    }

    @JsonProperty("ARCHERY")
    public String getArchery() {
        return archery;
    }

    @JsonProperty("ARCHERY")
    public void setArchery(String archery) {
        this.archery = archery;
    }

    @JsonProperty("LOTTERY")
    public String getLottery() {
        return lottery;
    }

    @JsonProperty("LOTTERY")
    public void setLottery(String lottery) {
        this.lottery = lottery;
    }

    @JsonProperty("CANOEING")
    public String getCanoeing() {
        return canoeing;
    }

    @JsonProperty("CANOEING")
    public void setCanoeing(String canoeing) {
        this.canoeing = canoeing;
    }

    @JsonProperty("EQUESTRIAN")
    public String getEquestrian() {
        return equestrian;
    }

    @JsonProperty("EQUESTRIAN")
    public void setEquestrian(String equestrian) {
        this.equestrian = equestrian;
    }

    @JsonProperty("FENCING")
    public String getFencing() {
        return fencing;
    }

    @JsonProperty("FENCING")
    public void setFencing(String fencing) {
        this.fencing = fencing;
    }

    @JsonProperty("JUDO")
    public String getJudo() {
        return judo;
    }

    @JsonProperty("JUDO")
    public void setJudo(String judo) {
        this.judo = judo;
    }

    @JsonProperty("MODERN_PENTATHLON")
    public String getModernPentathlon() {
        return modernPentathlon;
    }

    @JsonProperty("MODERN_PENTATHLON")
    public void setModernPentathlon(String modernPentathlon) {
        this.modernPentathlon = modernPentathlon;
    }

    @JsonProperty("TAEKWONDO")
    public String getTaekwondo() {
        return taekwondo;
    }

    @JsonProperty("TAEKWONDO")
    public void setTaekwondo(String taekwondo) {
        this.taekwondo = taekwondo;
    }

    @JsonProperty("RUSH_2_FOOTBALL")
    public String getRush2Football() {
        return rush2Football;
    }

    @JsonProperty("RUSH_2_FOOTBALL")
    public void setRush2Football(String rush2Football) {
        this.rush2Football = rush2Football;
    }

    @JsonProperty("INSPIRED_HORSE_RACING")
    public String getInspiredHorseRacing() {
        return inspiredHorseRacing;
    }

    @JsonProperty("INSPIRED_HORSE_RACING")
    public void setInspiredHorseRacing(String inspiredHorseRacing) {
        this.inspiredHorseRacing = inspiredHorseRacing;
    }

    @JsonProperty("MOTOR_RACING")
    public String getMotorRacing() {
        return motorRacing;
    }

    @JsonProperty("MOTOR_RACING")
    public void setMotorRacing(String motorRacing) {
        this.motorRacing = motorRacing;
    }

    @JsonProperty("INSPIRED_SPEEDWAY")
    public String getInspiredSpeedway() {
        return inspiredSpeedway;
    }

    @JsonProperty("INSPIRED_SPEEDWAY")
    public void setInspiredSpeedway(String inspiredSpeedway) {
        this.inspiredSpeedway = inspiredSpeedway;
    }

    @JsonProperty("INSPIRED_CYCLING")
    public String getInspiredCycling() {
        return inspiredCycling;
    }

    @JsonProperty("INSPIRED_CYCLING")
    public void setInspiredCycling(String inspiredCycling) {
        this.inspiredCycling = inspiredCycling;
    }

    @JsonProperty("GREYHOUND_RACING")
    public String getGreyhoundRacing() {
        return greyhoundRacing;
    }

    @JsonProperty("GREYHOUND_RACING")
    public void setGreyhoundRacing(String greyhoundRacing) {
        this.greyhoundRacing = greyhoundRacing;
    }

    @JsonProperty("INSPIRED_TROTTING")
    public String getInspiredTrotting() {
        return inspiredTrotting;
    }

    @JsonProperty("INSPIRED_TROTTING")
    public void setInspiredTrotting(String inspiredTrotting) {
        this.inspiredTrotting = inspiredTrotting;
    }

    @JsonProperty("E_TENNIS")
    public String getETennis() {
        return eTennis;
    }

    @JsonProperty("E_TENNIS")
    public void setETennis(String eTennis) {
        this.eTennis = eTennis;
    }

    @JsonProperty("CROSSFIRE")
    public String getCrossfire() {
        return crossfire;
    }

    @JsonProperty("CROSSFIRE")
    public void setCrossfire(String crossfire) {
        this.crossfire = crossfire;
    }

    @JsonProperty("HALO")
    public String getHalo() {
        return halo;
    }

    @JsonProperty("HALO")
    public void setHalo(String halo) {
        this.halo = halo;
    }

    @JsonProperty("FIFA")
    public String getFifa() {
        return fifa;
    }

    @JsonProperty("FIFA")
    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    @JsonProperty("NORDIC_COMBINED")
    public String getNordicCombined() {
        return nordicCombined;
    }

    @JsonProperty("NORDIC_COMBINED")
    public void setNordicCombined(String nordicCombined) {
        this.nordicCombined = nordicCombined;
    }

    @JsonProperty("GEARS_OF_WAR")
    public String getGearsOfWar() {
        return gearsOfWar;
    }

    @JsonProperty("GEARS_OF_WAR")
    public void setGearsOfWar(String gearsOfWar) {
        this.gearsOfWar = gearsOfWar;
    }

    @JsonProperty("INDOOR_HOCKEY")
    public String getIndoorHockey() {
        return indoorHockey;
    }

    @JsonProperty("INDOOR_HOCKEY")
    public void setIndoorHockey(String indoorHockey) {
        this.indoorHockey = indoorHockey;
    }

    @JsonProperty("CLASH_ROYALE")
    public String getClashRoyale() {
        return clashRoyale;
    }

    @JsonProperty("CLASH_ROYALE")
    public void setClashRoyale(String clashRoyale) {
        this.clashRoyale = clashRoyale;
    }

    @JsonProperty("TV_SHOWS_AND_MOVIES")
    public String getTvShowsAndMovies() {
        return tvShowsAndMovies;
    }

    @JsonProperty("TV_SHOWS_AND_MOVIES")
    public void setTvShowsAndMovies(String tvShowsAndMovies) {
        this.tvShowsAndMovies = tvShowsAndMovies;
    }

    @JsonProperty("MIXED_FOOTBALL")
    public String getMixedFootball() {
        return mixedFootball;
    }

    @JsonProperty("MIXED_FOOTBALL")
    public void setMixedFootball(String mixedFootball) {
        this.mixedFootball = mixedFootball;
    }

    @JsonProperty("STREET_FIGHTER_V")
    public String getStreetFighterV() {
        return streetFighterV;
    }

    @JsonProperty("STREET_FIGHTER_V")
    public void setStreetFighterV(String streetFighterV) {
        this.streetFighterV = streetFighterV;
    }

    @JsonProperty("VIRTUAL_BICYCLE")
    public String getVirtualBicycle() {
        return virtualBicycle;
    }

    @JsonProperty("VIRTUAL_BICYCLE")
    public void setVirtualBicycle(String virtualBicycle) {
        this.virtualBicycle = virtualBicycle;
    }

    @JsonProperty("SKELETON")
    public String getSkeleton() {
        return skeleton;
    }

    @JsonProperty("SKELETON")
    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    @JsonProperty("BOBSLEIGH")
    public String getBobsleigh() {
        return bobsleigh;
    }

    @JsonProperty("BOBSLEIGH")
    public void setBobsleigh(String bobsleigh) {
        this.bobsleigh = bobsleigh;
    }

    @JsonProperty("TROTTING")
    public String getTrotting() {
        return trotting;
    }

    @JsonProperty("TROTTING")
    public void setTrotting(String trotting) {
        this.trotting = trotting;
    }

    @JsonProperty("MORTAL_KOMBAT_XL")
    public String getMortalKombatXl() {
        return mortalKombatXl;
    }

    @JsonProperty("MORTAL_KOMBAT_XL")
    public void setMortalKombatXl(String mortalKombatXl) {
        this.mortalKombatXl = mortalKombatXl;
    }

    @JsonProperty("ROCKET_LEAGUE")
    public String getRocketLeague() {
        return rocketLeague;
    }

    @JsonProperty("ROCKET_LEAGUE")
    public void setRocketLeague(String rocketLeague) {
        this.rocketLeague = rocketLeague;
    }

    @JsonProperty("KING_OF_GLORY")
    public String getKingOfGlory() {
        return kingOfGlory;
    }

    @JsonProperty("KING_OF_GLORY")
    public void setKingOfGlory(String kingOfGlory) {
        this.kingOfGlory = kingOfGlory;
    }

    @JsonProperty("BETONPOKER")
    public String getBetonpoker() {
        return betonpoker;
    }

    @JsonProperty("BETONPOKER")
    public void setBetonpoker(String betonpoker) {
        this.betonpoker = betonpoker;
    }

    @JsonProperty("BETONBLACKJACK")
    public String getBetonblackjack() {
        return betonblackjack;
    }

    @JsonProperty("BETONBLACKJACK")
    public void setBetonblackjack(String betonblackjack) {
        this.betonblackjack = betonblackjack;
    }

    @JsonProperty("LIVEBETONPOKER")
    public String getLivebetonpoker() {
        return livebetonpoker;
    }

    @JsonProperty("LIVEBETONPOKER")
    public void setLivebetonpoker(String livebetonpoker) {
        this.livebetonpoker = livebetonpoker;
    }

    @JsonProperty("LIVEBETONBACCARAT")
    public String getLivebetonbaccarat() {
        return livebetonbaccarat;
    }

    @JsonProperty("LIVEBETONBACCARAT")
    public void setLivebetonbaccarat(String livebetonbaccarat) {
        this.livebetonbaccarat = livebetonbaccarat;
    }

    @JsonProperty("QUAKE")
    public String getQuake() {
        return quake;
    }

    @JsonProperty("QUAKE")
    public void setQuake(String quake) {
        this.quake = quake;
    }

    @JsonProperty("PUBG")
    public String getPubg() {
        return pubg;
    }

    @JsonProperty("PUBG")
    public void setPubg(String pubg) {
        this.pubg = pubg;
    }

    @JsonProperty("KABADDI")
    public String getKabaddi() {
        return kabaddi;
    }

    @JsonProperty("KABADDI")
    public void setKabaddi(String kabaddi) {
        this.kabaddi = kabaddi;
    }

    @JsonProperty("UFC_2")
    public String getUfc2() {
        return ufc2;
    }

    @JsonProperty("UFC_2")
    public void setUfc2(String ufc2) {
        this.ufc2 = ufc2;
    }

    @JsonProperty("STREET_FIGHTER")
    public String getStreetFighter() {
        return streetFighter;
    }

    @JsonProperty("STREET_FIGHTER")
    public void setStreetFighter(String streetFighter) {
        this.streetFighter = streetFighter;
    }

    @JsonProperty("TEKKEN_7")
    public String getTekken7() {
        return tekken7;
    }

    @JsonProperty("TEKKEN_7")
    public void setTekken7(String tekken7) {
        this.tekken7 = tekken7;
    }

    @JsonProperty("WARCRAFT_III")
    public String getWarcraftIii() {
        return warcraftIii;
    }

    @JsonProperty("WARCRAFT_III")
    public void setWarcraftIii(String warcraftIii) {
        this.warcraftIii = warcraftIii;
    }

    @JsonProperty("INTERNATIONAL_RULES")
    public String getInternationalRules() {
        return internationalRules;
    }

    @JsonProperty("INTERNATIONAL_RULES")
    public void setInternationalRules(String internationalRules) {
        this.internationalRules = internationalRules;
    }

    @JsonProperty("BASKETBALL_SHOTS")
    public String getBasketballShots() {
        return basketballShots;
    }

    @JsonProperty("BASKETBALL_SHOTS")
    public void setBasketballShots(String basketballShots) {
        this.basketballShots = basketballShots;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
