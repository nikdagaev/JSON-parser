
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EVENT_DELETED_OR_MARKET_SUSPENDED_SELECTION",
    "EVENT_DELETED_OR_MARKET_SUSPENDED_END",
    "INSUFFICIENT_BALANCE",
    "INTERNAL_ERROR",
    "USER_NOT_FOUND",
    "WRONG_LOGIN",
    "USER_BLOCKED",
    "USER_DISMISSED",
    "NOT_VERIFIED_VIA_EMAIL",
    "FORK_EXCEPTION",
    "GAME_STARTED",
    "GAME_START_TIME_PAST",
    "BET_EDITING_TIME_PAST",
    "BET_PAYED",
    "BET_STATUS_NOT_FIXED",
    "BET_LOSE",
    "BET_IS_ONLINE",
    "WRONG_VALUE_FOR_COEFFICIENT",
    "WRONG_VALUE_FOR_AMOUNT",
    "REQUEST_PAID",
    "REQUEST_STORED",
    "AMOUNT_NOT_VALID_RANGE",
    "BET_TYPE_ERROR",
    "BET_DECLINED_BY_SKKS",
    "NOT_ALLOWED_TO_BET_EVENT",
    "CARD_LOT_BLOCKED",
    "SCRATCH_CARD_ACTIVATED",
    "SCRATCH_CARD_BLOCKED",
    "WRONG_SCRATCH_CARD_CURRENCY",
    "WRONG_VALUE_EXCEPTION",
    "WRONG_SCRATCH_CARD_NUMBER",
    "DOUBLE_VALUE_EXCEPTION",
    "DOUBLE_EVENT_EXCEPTION",
    "LIMIT_EXCEPTION",
    "EXCEEDS_SUM_MAX_LIMIT",
    "SUM_LESS_THAN_MIN_LIMIT",
    "CORRECTION_OF_COEFFICIENT",
    "WRONG_ACCESS_EXCEPTION",
    "ODDS_IS_CHANGED",
    "EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_EXPRESS",
    "ODDS_RESTRICTION_EXCEPTION",
    "CURRENCY_MISMATCH",
    "CLIENT_EXCLUDED",
    "CLIENT_LOCKED",
    "MARKET_SUSPENDED",
    "GAME_SUSPENDED",
    "WRONG_REGION",
    "ACCESS_NOT_ACTIVATED",
    "PARTNER_API_CLIENT_BALANCE_ERROR",
    "PARTNER_API_CLIENT_LIMIT_ERROR",
    "PARTNER_API_EMPTY_METHOD",
    "PARTNER_API_EMPTY_REQUEST_BODY",
    "PARTNER_API_MAX_LIMIT",
    "PARTNER_API_MIN_LIMIT",
    "PARTNER_API_PASSTOKEN_ERROR",
    "PARTNER_API_TIMESTAMP_EXPIRED",
    "PARTNER_API_TOKEN_EXPIRED",
    "PARTNER_API_USER_BLOCKED",
    "PARTNER_API_WRONG_HASH",
    "PARTNER_API_WRONG_LOGIN_EMAIL",
    "PARTNER_API_WRONG_ACCESS",
    "PARTNER_NOT_FOUND",
    "PARTNER_COMMERCIAL_FEE_NOT_FOUND",
    "SELECTION_NOT_FOUND",
    "SELECTION_COUNT_MISMATCH",
    "EVENT_SUSPENDED",
    "SPORT_MISMATCH",
    "SPORT_NOT_SUPPORTED_FOR_THE_PARTNER",
    "PAYMENT_RESTRICTION_EXCEPTION",
    "CLIENT_LIMIT_EXCEPTION",
    "WRONG_CURRENCY_CODE",
    "CURRENCY_NOT_SUPPORTED",
    "NEGATIVE_AMOUNT",
    "BET_SELECTIONS_CANNOT_BE_CHAINED_TOGETHER",
    "BONUS_NOT_FOUND",
    "PARTNER_BONUS_NOT_FOUND",
    "CLIENT_HAS_ACTIVE_BONUS",
    "INVALID_CLIENT_BONUS",
    "CLIENT_RESTRICTED_FOR_ACTION",
    "EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_ORDINAR",
    "PARTNER_NOT_SUPPORTED_TEST_CLIENT",
    "PARTNER_NOT_USING_LOYALTY_PROGRAM",
    "POINT_EXCHANGE_RANGE_EXCEED",
    "CLIENT_NOT_USING_LOYALTY_PROGRAM",
    "PARTNER_LIMIT_AMOUNT_EXCEED",
    "CLIENT_HAS_ACCEPTED_BONUS",
    "PARTNER_API_ERROR",
    "TEAM_NOT_FOUND",
    "INVALID_CLIENT_VERIFICATION_STEP_STATE",
    "PARTNER_SPORTS_BOOK_CURRENCY_SETTING",
    "CLIENT_BET_MIN_STAKE_LIMIT_ERROR",
    "MAX_DEPOSIT_REQUEST_SUM",
    "EMAIL_WRONG_HASH",
    "CLIENT_ALREADY_SELF_EXCLUDED",
    "TRANSACTION_AMOUNT_EXCEEDS_FROZEN_MONEY",
    "WRONG_HASH",
    "ACCEPTED",
    "PARTNER_MISMATCH",
    "MATCH_NOT_VISIBLE",
    "LOYALTY_LEVEL_NOT_FOUNT",
    "PLACED_ON_HOLD",
    "ODDS_1000"
})
@Generated("jsonschema2pojo")
@ToString
public class BetErrors {

    @JsonProperty("EVENT_DELETED_OR_MARKET_SUSPENDED_SELECTION")
    private String eventDeletedOrMarketSuspendedSelection;
    @JsonProperty("EVENT_DELETED_OR_MARKET_SUSPENDED_END")
    private String eventDeletedOrMarketSuspendedEnd;
    @JsonProperty("INSUFFICIENT_BALANCE")
    private String insufficientBalance;
    @JsonProperty("INTERNAL_ERROR")
    private String internalError;
    @JsonProperty("USER_NOT_FOUND")
    private String userNotFound;
    @JsonProperty("WRONG_LOGIN")
    private String wrongLogin;
    @JsonProperty("USER_BLOCKED")
    private String userBlocked;
    @JsonProperty("USER_DISMISSED")
    private String userDismissed;
    @JsonProperty("NOT_VERIFIED_VIA_EMAIL")
    private String notVerifiedViaEmail;
    @JsonProperty("FORK_EXCEPTION")
    private String forkException;
    @JsonProperty("GAME_STARTED")
    private String gameStarted;
    @JsonProperty("GAME_START_TIME_PAST")
    private String gameStartTimePast;
    @JsonProperty("BET_EDITING_TIME_PAST")
    private String betEditingTimePast;
    @JsonProperty("BET_PAYED")
    private String betPayed;
    @JsonProperty("BET_STATUS_NOT_FIXED")
    private String betStatusNotFixed;
    @JsonProperty("BET_LOSE")
    private String betLose;
    @JsonProperty("BET_IS_ONLINE")
    private String betIsOnline;
    @JsonProperty("WRONG_VALUE_FOR_COEFFICIENT")
    private String wrongValueForCoefficient;
    @JsonProperty("WRONG_VALUE_FOR_AMOUNT")
    private String wrongValueForAmount;
    @JsonProperty("REQUEST_PAID")
    private String requestPaid;
    @JsonProperty("REQUEST_STORED")
    private String requestStored;
    @JsonProperty("AMOUNT_NOT_VALID_RANGE")
    private String amountNotValidRange;
    @JsonProperty("BET_TYPE_ERROR")
    private String betTypeError;
    @JsonProperty("BET_DECLINED_BY_SKKS")
    private String betDeclinedBySkks;
    @JsonProperty("NOT_ALLOWED_TO_BET_EVENT")
    private String notAllowedToBetEvent;
    @JsonProperty("CARD_LOT_BLOCKED")
    private String cardLotBlocked;
    @JsonProperty("SCRATCH_CARD_ACTIVATED")
    private String scratchCardActivated;
    @JsonProperty("SCRATCH_CARD_BLOCKED")
    private String scratchCardBlocked;
    @JsonProperty("WRONG_SCRATCH_CARD_CURRENCY")
    private String wrongScratchCardCurrency;
    @JsonProperty("WRONG_VALUE_EXCEPTION")
    private String wrongValueException;
    @JsonProperty("WRONG_SCRATCH_CARD_NUMBER")
    private String wrongScratchCardNumber;
    @JsonProperty("DOUBLE_VALUE_EXCEPTION")
    private String doubleValueException;
    @JsonProperty("DOUBLE_EVENT_EXCEPTION")
    private String doubleEventException;
    @JsonProperty("LIMIT_EXCEPTION")
    private String limitException;
    @JsonProperty("EXCEEDS_SUM_MAX_LIMIT")
    private String exceedsSumMaxLimit;
    @JsonProperty("SUM_LESS_THAN_MIN_LIMIT")
    private String sumLessThanMinLimit;
    @JsonProperty("CORRECTION_OF_COEFFICIENT")
    private String correctionOfCoefficient;
    @JsonProperty("WRONG_ACCESS_EXCEPTION")
    private String wrongAccessException;
    @JsonProperty("ODDS_IS_CHANGED")
    private String oddsIsChanged;
    @JsonProperty("EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_EXPRESS")
    private String eventsCanBeIncludedOnlyInTheExpress;
    @JsonProperty("ODDS_RESTRICTION_EXCEPTION")
    private String oddsRestrictionException;
    @JsonProperty("CURRENCY_MISMATCH")
    private String currencyMismatch;
    @JsonProperty("CLIENT_EXCLUDED")
    private String clientExcluded;
    @JsonProperty("CLIENT_LOCKED")
    private String clientLocked;
    @JsonProperty("MARKET_SUSPENDED")
    private String marketSuspended;
    @JsonProperty("GAME_SUSPENDED")
    private String gameSuspended;
    @JsonProperty("WRONG_REGION")
    private String wrongRegion;
    @JsonProperty("ACCESS_NOT_ACTIVATED")
    private String accessNotActivated;
    @JsonProperty("PARTNER_API_CLIENT_BALANCE_ERROR")
    private String partnerApiClientBalanceError;
    @JsonProperty("PARTNER_API_CLIENT_LIMIT_ERROR")
    private String partnerApiClientLimitError;
    @JsonProperty("PARTNER_API_EMPTY_METHOD")
    private String partnerApiEmptyMethod;
    @JsonProperty("PARTNER_API_EMPTY_REQUEST_BODY")
    private String partnerApiEmptyRequestBody;
    @JsonProperty("PARTNER_API_MAX_LIMIT")
    private String partnerApiMaxLimit;
    @JsonProperty("PARTNER_API_MIN_LIMIT")
    private String partnerApiMinLimit;
    @JsonProperty("PARTNER_API_PASSTOKEN_ERROR")
    private String partnerApiPasstokenError;
    @JsonProperty("PARTNER_API_TIMESTAMP_EXPIRED")
    private String partnerApiTimestampExpired;
    @JsonProperty("PARTNER_API_TOKEN_EXPIRED")
    private String partnerApiTokenExpired;
    @JsonProperty("PARTNER_API_USER_BLOCKED")
    private String partnerApiUserBlocked;
    @JsonProperty("PARTNER_API_WRONG_HASH")
    private String partnerApiWrongHash;
    @JsonProperty("PARTNER_API_WRONG_LOGIN_EMAIL")
    private String partnerApiWrongLoginEmail;
    @JsonProperty("PARTNER_API_WRONG_ACCESS")
    private String partnerApiWrongAccess;
    @JsonProperty("PARTNER_NOT_FOUND")
    private String partnerNotFound;
    @JsonProperty("PARTNER_COMMERCIAL_FEE_NOT_FOUND")
    private String partnerCommercialFeeNotFound;
    @JsonProperty("SELECTION_NOT_FOUND")
    private String selectionNotFound;
    @JsonProperty("SELECTION_COUNT_MISMATCH")
    private String selectionCountMismatch;
    @JsonProperty("EVENT_SUSPENDED")
    private String eventSuspended;
    @JsonProperty("SPORT_MISMATCH")
    private String sportMismatch;
    @JsonProperty("SPORT_NOT_SUPPORTED_FOR_THE_PARTNER")
    private String sportNotSupportedForThePartner;
    @JsonProperty("PAYMENT_RESTRICTION_EXCEPTION")
    private String paymentRestrictionException;
    @JsonProperty("CLIENT_LIMIT_EXCEPTION")
    private String clientLimitException;
    @JsonProperty("WRONG_CURRENCY_CODE")
    private String wrongCurrencyCode;
    @JsonProperty("CURRENCY_NOT_SUPPORTED")
    private String currencyNotSupported;
    @JsonProperty("NEGATIVE_AMOUNT")
    private String negativeAmount;
    @JsonProperty("BET_SELECTIONS_CANNOT_BE_CHAINED_TOGETHER")
    private String betSelectionsCannotBeChainedTogether;
    @JsonProperty("BONUS_NOT_FOUND")
    private String bonusNotFound;
    @JsonProperty("PARTNER_BONUS_NOT_FOUND")
    private String partnerBonusNotFound;
    @JsonProperty("CLIENT_HAS_ACTIVE_BONUS")
    private String clientHasActiveBonus;
    @JsonProperty("INVALID_CLIENT_BONUS")
    private String invalidClientBonus;
    @JsonProperty("CLIENT_RESTRICTED_FOR_ACTION")
    private String clientRestrictedForAction;
    @JsonProperty("EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_ORDINAR")
    private String eventsCanBeIncludedOnlyInTheOrdinar;
    @JsonProperty("PARTNER_NOT_SUPPORTED_TEST_CLIENT")
    private String partnerNotSupportedTestClient;
    @JsonProperty("PARTNER_NOT_USING_LOYALTY_PROGRAM")
    private String partnerNotUsingLoyaltyProgram;
    @JsonProperty("POINT_EXCHANGE_RANGE_EXCEED")
    private String pointExchangeRangeExceed;
    @JsonProperty("CLIENT_NOT_USING_LOYALTY_PROGRAM")
    private String clientNotUsingLoyaltyProgram;
    @JsonProperty("PARTNER_LIMIT_AMOUNT_EXCEED")
    private String partnerLimitAmountExceed;
    @JsonProperty("CLIENT_HAS_ACCEPTED_BONUS")
    private String clientHasAcceptedBonus;
    @JsonProperty("PARTNER_API_ERROR")
    private String partnerApiError;
    @JsonProperty("TEAM_NOT_FOUND")
    private String teamNotFound;
    @JsonProperty("INVALID_CLIENT_VERIFICATION_STEP_STATE")
    private String invalidClientVerificationStepState;
    @JsonProperty("PARTNER_SPORTS_BOOK_CURRENCY_SETTING")
    private String partnerSportsBookCurrencySetting;
    @JsonProperty("CLIENT_BET_MIN_STAKE_LIMIT_ERROR")
    private String clientBetMinStakeLimitError;
    @JsonProperty("MAX_DEPOSIT_REQUEST_SUM")
    private String maxDepositRequestSum;
    @JsonProperty("EMAIL_WRONG_HASH")
    private String emailWrongHash;
    @JsonProperty("CLIENT_ALREADY_SELF_EXCLUDED")
    private String clientAlreadySelfExcluded;
    @JsonProperty("TRANSACTION_AMOUNT_EXCEEDS_FROZEN_MONEY")
    private String transactionAmountExceedsFrozenMoney;
    @JsonProperty("WRONG_HASH")
    private String wrongHash;
    @JsonProperty("ACCEPTED")
    private String accepted;
    @JsonProperty("PARTNER_MISMATCH")
    private String partnerMismatch;
    @JsonProperty("MATCH_NOT_VISIBLE")
    private String matchNotVisible;
    @JsonProperty("LOYALTY_LEVEL_NOT_FOUNT")
    private String loyaltyLevelNotFount;
    @JsonProperty("PLACED_ON_HOLD")
    private String placedOnHold;
    @JsonProperty("ODDS_1000")
    private String odds1000;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EVENT_DELETED_OR_MARKET_SUSPENDED_SELECTION")
    public String getEventDeletedOrMarketSuspendedSelection() {
        return eventDeletedOrMarketSuspendedSelection;
    }

    @JsonProperty("EVENT_DELETED_OR_MARKET_SUSPENDED_SELECTION")
    public void setEventDeletedOrMarketSuspendedSelection(String eventDeletedOrMarketSuspendedSelection) {
        this.eventDeletedOrMarketSuspendedSelection = eventDeletedOrMarketSuspendedSelection;
    }

    @JsonProperty("EVENT_DELETED_OR_MARKET_SUSPENDED_END")
    public String getEventDeletedOrMarketSuspendedEnd() {
        return eventDeletedOrMarketSuspendedEnd;
    }

    @JsonProperty("EVENT_DELETED_OR_MARKET_SUSPENDED_END")
    public void setEventDeletedOrMarketSuspendedEnd(String eventDeletedOrMarketSuspendedEnd) {
        this.eventDeletedOrMarketSuspendedEnd = eventDeletedOrMarketSuspendedEnd;
    }

    @JsonProperty("INSUFFICIENT_BALANCE")
    public String getInsufficientBalance() {
        return insufficientBalance;
    }

    @JsonProperty("INSUFFICIENT_BALANCE")
    public void setInsufficientBalance(String insufficientBalance) {
        this.insufficientBalance = insufficientBalance;
    }

    @JsonProperty("INTERNAL_ERROR")
    public String getInternalError() {
        return internalError;
    }

    @JsonProperty("INTERNAL_ERROR")
    public void setInternalError(String internalError) {
        this.internalError = internalError;
    }

    @JsonProperty("USER_NOT_FOUND")
    public String getUserNotFound() {
        return userNotFound;
    }

    @JsonProperty("USER_NOT_FOUND")
    public void setUserNotFound(String userNotFound) {
        this.userNotFound = userNotFound;
    }

    @JsonProperty("WRONG_LOGIN")
    public String getWrongLogin() {
        return wrongLogin;
    }

    @JsonProperty("WRONG_LOGIN")
    public void setWrongLogin(String wrongLogin) {
        this.wrongLogin = wrongLogin;
    }

    @JsonProperty("USER_BLOCKED")
    public String getUserBlocked() {
        return userBlocked;
    }

    @JsonProperty("USER_BLOCKED")
    public void setUserBlocked(String userBlocked) {
        this.userBlocked = userBlocked;
    }

    @JsonProperty("USER_DISMISSED")
    public String getUserDismissed() {
        return userDismissed;
    }

    @JsonProperty("USER_DISMISSED")
    public void setUserDismissed(String userDismissed) {
        this.userDismissed = userDismissed;
    }

    @JsonProperty("NOT_VERIFIED_VIA_EMAIL")
    public String getNotVerifiedViaEmail() {
        return notVerifiedViaEmail;
    }

    @JsonProperty("NOT_VERIFIED_VIA_EMAIL")
    public void setNotVerifiedViaEmail(String notVerifiedViaEmail) {
        this.notVerifiedViaEmail = notVerifiedViaEmail;
    }

    @JsonProperty("FORK_EXCEPTION")
    public String getForkException() {
        return forkException;
    }

    @JsonProperty("FORK_EXCEPTION")
    public void setForkException(String forkException) {
        this.forkException = forkException;
    }

    @JsonProperty("GAME_STARTED")
    public String getGameStarted() {
        return gameStarted;
    }

    @JsonProperty("GAME_STARTED")
    public void setGameStarted(String gameStarted) {
        this.gameStarted = gameStarted;
    }

    @JsonProperty("GAME_START_TIME_PAST")
    public String getGameStartTimePast() {
        return gameStartTimePast;
    }

    @JsonProperty("GAME_START_TIME_PAST")
    public void setGameStartTimePast(String gameStartTimePast) {
        this.gameStartTimePast = gameStartTimePast;
    }

    @JsonProperty("BET_EDITING_TIME_PAST")
    public String getBetEditingTimePast() {
        return betEditingTimePast;
    }

    @JsonProperty("BET_EDITING_TIME_PAST")
    public void setBetEditingTimePast(String betEditingTimePast) {
        this.betEditingTimePast = betEditingTimePast;
    }

    @JsonProperty("BET_PAYED")
    public String getBetPayed() {
        return betPayed;
    }

    @JsonProperty("BET_PAYED")
    public void setBetPayed(String betPayed) {
        this.betPayed = betPayed;
    }

    @JsonProperty("BET_STATUS_NOT_FIXED")
    public String getBetStatusNotFixed() {
        return betStatusNotFixed;
    }

    @JsonProperty("BET_STATUS_NOT_FIXED")
    public void setBetStatusNotFixed(String betStatusNotFixed) {
        this.betStatusNotFixed = betStatusNotFixed;
    }

    @JsonProperty("BET_LOSE")
    public String getBetLose() {
        return betLose;
    }

    @JsonProperty("BET_LOSE")
    public void setBetLose(String betLose) {
        this.betLose = betLose;
    }

    @JsonProperty("BET_IS_ONLINE")
    public String getBetIsOnline() {
        return betIsOnline;
    }

    @JsonProperty("BET_IS_ONLINE")
    public void setBetIsOnline(String betIsOnline) {
        this.betIsOnline = betIsOnline;
    }

    @JsonProperty("WRONG_VALUE_FOR_COEFFICIENT")
    public String getWrongValueForCoefficient() {
        return wrongValueForCoefficient;
    }

    @JsonProperty("WRONG_VALUE_FOR_COEFFICIENT")
    public void setWrongValueForCoefficient(String wrongValueForCoefficient) {
        this.wrongValueForCoefficient = wrongValueForCoefficient;
    }

    @JsonProperty("WRONG_VALUE_FOR_AMOUNT")
    public String getWrongValueForAmount() {
        return wrongValueForAmount;
    }

    @JsonProperty("WRONG_VALUE_FOR_AMOUNT")
    public void setWrongValueForAmount(String wrongValueForAmount) {
        this.wrongValueForAmount = wrongValueForAmount;
    }

    @JsonProperty("REQUEST_PAID")
    public String getRequestPaid() {
        return requestPaid;
    }

    @JsonProperty("REQUEST_PAID")
    public void setRequestPaid(String requestPaid) {
        this.requestPaid = requestPaid;
    }

    @JsonProperty("REQUEST_STORED")
    public String getRequestStored() {
        return requestStored;
    }

    @JsonProperty("REQUEST_STORED")
    public void setRequestStored(String requestStored) {
        this.requestStored = requestStored;
    }

    @JsonProperty("AMOUNT_NOT_VALID_RANGE")
    public String getAmountNotValidRange() {
        return amountNotValidRange;
    }

    @JsonProperty("AMOUNT_NOT_VALID_RANGE")
    public void setAmountNotValidRange(String amountNotValidRange) {
        this.amountNotValidRange = amountNotValidRange;
    }

    @JsonProperty("BET_TYPE_ERROR")
    public String getBetTypeError() {
        return betTypeError;
    }

    @JsonProperty("BET_TYPE_ERROR")
    public void setBetTypeError(String betTypeError) {
        this.betTypeError = betTypeError;
    }

    @JsonProperty("BET_DECLINED_BY_SKKS")
    public String getBetDeclinedBySkks() {
        return betDeclinedBySkks;
    }

    @JsonProperty("BET_DECLINED_BY_SKKS")
    public void setBetDeclinedBySkks(String betDeclinedBySkks) {
        this.betDeclinedBySkks = betDeclinedBySkks;
    }

    @JsonProperty("NOT_ALLOWED_TO_BET_EVENT")
    public String getNotAllowedToBetEvent() {
        return notAllowedToBetEvent;
    }

    @JsonProperty("NOT_ALLOWED_TO_BET_EVENT")
    public void setNotAllowedToBetEvent(String notAllowedToBetEvent) {
        this.notAllowedToBetEvent = notAllowedToBetEvent;
    }

    @JsonProperty("CARD_LOT_BLOCKED")
    public String getCardLotBlocked() {
        return cardLotBlocked;
    }

    @JsonProperty("CARD_LOT_BLOCKED")
    public void setCardLotBlocked(String cardLotBlocked) {
        this.cardLotBlocked = cardLotBlocked;
    }

    @JsonProperty("SCRATCH_CARD_ACTIVATED")
    public String getScratchCardActivated() {
        return scratchCardActivated;
    }

    @JsonProperty("SCRATCH_CARD_ACTIVATED")
    public void setScratchCardActivated(String scratchCardActivated) {
        this.scratchCardActivated = scratchCardActivated;
    }

    @JsonProperty("SCRATCH_CARD_BLOCKED")
    public String getScratchCardBlocked() {
        return scratchCardBlocked;
    }

    @JsonProperty("SCRATCH_CARD_BLOCKED")
    public void setScratchCardBlocked(String scratchCardBlocked) {
        this.scratchCardBlocked = scratchCardBlocked;
    }

    @JsonProperty("WRONG_SCRATCH_CARD_CURRENCY")
    public String getWrongScratchCardCurrency() {
        return wrongScratchCardCurrency;
    }

    @JsonProperty("WRONG_SCRATCH_CARD_CURRENCY")
    public void setWrongScratchCardCurrency(String wrongScratchCardCurrency) {
        this.wrongScratchCardCurrency = wrongScratchCardCurrency;
    }

    @JsonProperty("WRONG_VALUE_EXCEPTION")
    public String getWrongValueException() {
        return wrongValueException;
    }

    @JsonProperty("WRONG_VALUE_EXCEPTION")
    public void setWrongValueException(String wrongValueException) {
        this.wrongValueException = wrongValueException;
    }

    @JsonProperty("WRONG_SCRATCH_CARD_NUMBER")
    public String getWrongScratchCardNumber() {
        return wrongScratchCardNumber;
    }

    @JsonProperty("WRONG_SCRATCH_CARD_NUMBER")
    public void setWrongScratchCardNumber(String wrongScratchCardNumber) {
        this.wrongScratchCardNumber = wrongScratchCardNumber;
    }

    @JsonProperty("DOUBLE_VALUE_EXCEPTION")
    public String getDoubleValueException() {
        return doubleValueException;
    }

    @JsonProperty("DOUBLE_VALUE_EXCEPTION")
    public void setDoubleValueException(String doubleValueException) {
        this.doubleValueException = doubleValueException;
    }

    @JsonProperty("DOUBLE_EVENT_EXCEPTION")
    public String getDoubleEventException() {
        return doubleEventException;
    }

    @JsonProperty("DOUBLE_EVENT_EXCEPTION")
    public void setDoubleEventException(String doubleEventException) {
        this.doubleEventException = doubleEventException;
    }

    @JsonProperty("LIMIT_EXCEPTION")
    public String getLimitException() {
        return limitException;
    }

    @JsonProperty("LIMIT_EXCEPTION")
    public void setLimitException(String limitException) {
        this.limitException = limitException;
    }

    @JsonProperty("EXCEEDS_SUM_MAX_LIMIT")
    public String getExceedsSumMaxLimit() {
        return exceedsSumMaxLimit;
    }

    @JsonProperty("EXCEEDS_SUM_MAX_LIMIT")
    public void setExceedsSumMaxLimit(String exceedsSumMaxLimit) {
        this.exceedsSumMaxLimit = exceedsSumMaxLimit;
    }

    @JsonProperty("SUM_LESS_THAN_MIN_LIMIT")
    public String getSumLessThanMinLimit() {
        return sumLessThanMinLimit;
    }

    @JsonProperty("SUM_LESS_THAN_MIN_LIMIT")
    public void setSumLessThanMinLimit(String sumLessThanMinLimit) {
        this.sumLessThanMinLimit = sumLessThanMinLimit;
    }

    @JsonProperty("CORRECTION_OF_COEFFICIENT")
    public String getCorrectionOfCoefficient() {
        return correctionOfCoefficient;
    }

    @JsonProperty("CORRECTION_OF_COEFFICIENT")
    public void setCorrectionOfCoefficient(String correctionOfCoefficient) {
        this.correctionOfCoefficient = correctionOfCoefficient;
    }

    @JsonProperty("WRONG_ACCESS_EXCEPTION")
    public String getWrongAccessException() {
        return wrongAccessException;
    }

    @JsonProperty("WRONG_ACCESS_EXCEPTION")
    public void setWrongAccessException(String wrongAccessException) {
        this.wrongAccessException = wrongAccessException;
    }

    @JsonProperty("ODDS_IS_CHANGED")
    public String getOddsIsChanged() {
        return oddsIsChanged;
    }

    @JsonProperty("ODDS_IS_CHANGED")
    public void setOddsIsChanged(String oddsIsChanged) {
        this.oddsIsChanged = oddsIsChanged;
    }

    @JsonProperty("EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_EXPRESS")
    public String getEventsCanBeIncludedOnlyInTheExpress() {
        return eventsCanBeIncludedOnlyInTheExpress;
    }

    @JsonProperty("EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_EXPRESS")
    public void setEventsCanBeIncludedOnlyInTheExpress(String eventsCanBeIncludedOnlyInTheExpress) {
        this.eventsCanBeIncludedOnlyInTheExpress = eventsCanBeIncludedOnlyInTheExpress;
    }

    @JsonProperty("ODDS_RESTRICTION_EXCEPTION")
    public String getOddsRestrictionException() {
        return oddsRestrictionException;
    }

    @JsonProperty("ODDS_RESTRICTION_EXCEPTION")
    public void setOddsRestrictionException(String oddsRestrictionException) {
        this.oddsRestrictionException = oddsRestrictionException;
    }

    @JsonProperty("CURRENCY_MISMATCH")
    public String getCurrencyMismatch() {
        return currencyMismatch;
    }

    @JsonProperty("CURRENCY_MISMATCH")
    public void setCurrencyMismatch(String currencyMismatch) {
        this.currencyMismatch = currencyMismatch;
    }

    @JsonProperty("CLIENT_EXCLUDED")
    public String getClientExcluded() {
        return clientExcluded;
    }

    @JsonProperty("CLIENT_EXCLUDED")
    public void setClientExcluded(String clientExcluded) {
        this.clientExcluded = clientExcluded;
    }

    @JsonProperty("CLIENT_LOCKED")
    public String getClientLocked() {
        return clientLocked;
    }

    @JsonProperty("CLIENT_LOCKED")
    public void setClientLocked(String clientLocked) {
        this.clientLocked = clientLocked;
    }

    @JsonProperty("MARKET_SUSPENDED")
    public String getMarketSuspended() {
        return marketSuspended;
    }

    @JsonProperty("MARKET_SUSPENDED")
    public void setMarketSuspended(String marketSuspended) {
        this.marketSuspended = marketSuspended;
    }

    @JsonProperty("GAME_SUSPENDED")
    public String getGameSuspended() {
        return gameSuspended;
    }

    @JsonProperty("GAME_SUSPENDED")
    public void setGameSuspended(String gameSuspended) {
        this.gameSuspended = gameSuspended;
    }

    @JsonProperty("WRONG_REGION")
    public String getWrongRegion() {
        return wrongRegion;
    }

    @JsonProperty("WRONG_REGION")
    public void setWrongRegion(String wrongRegion) {
        this.wrongRegion = wrongRegion;
    }

    @JsonProperty("ACCESS_NOT_ACTIVATED")
    public String getAccessNotActivated() {
        return accessNotActivated;
    }

    @JsonProperty("ACCESS_NOT_ACTIVATED")
    public void setAccessNotActivated(String accessNotActivated) {
        this.accessNotActivated = accessNotActivated;
    }

    @JsonProperty("PARTNER_API_CLIENT_BALANCE_ERROR")
    public String getPartnerApiClientBalanceError() {
        return partnerApiClientBalanceError;
    }

    @JsonProperty("PARTNER_API_CLIENT_BALANCE_ERROR")
    public void setPartnerApiClientBalanceError(String partnerApiClientBalanceError) {
        this.partnerApiClientBalanceError = partnerApiClientBalanceError;
    }

    @JsonProperty("PARTNER_API_CLIENT_LIMIT_ERROR")
    public String getPartnerApiClientLimitError() {
        return partnerApiClientLimitError;
    }

    @JsonProperty("PARTNER_API_CLIENT_LIMIT_ERROR")
    public void setPartnerApiClientLimitError(String partnerApiClientLimitError) {
        this.partnerApiClientLimitError = partnerApiClientLimitError;
    }

    @JsonProperty("PARTNER_API_EMPTY_METHOD")
    public String getPartnerApiEmptyMethod() {
        return partnerApiEmptyMethod;
    }

    @JsonProperty("PARTNER_API_EMPTY_METHOD")
    public void setPartnerApiEmptyMethod(String partnerApiEmptyMethod) {
        this.partnerApiEmptyMethod = partnerApiEmptyMethod;
    }

    @JsonProperty("PARTNER_API_EMPTY_REQUEST_BODY")
    public String getPartnerApiEmptyRequestBody() {
        return partnerApiEmptyRequestBody;
    }

    @JsonProperty("PARTNER_API_EMPTY_REQUEST_BODY")
    public void setPartnerApiEmptyRequestBody(String partnerApiEmptyRequestBody) {
        this.partnerApiEmptyRequestBody = partnerApiEmptyRequestBody;
    }

    @JsonProperty("PARTNER_API_MAX_LIMIT")
    public String getPartnerApiMaxLimit() {
        return partnerApiMaxLimit;
    }

    @JsonProperty("PARTNER_API_MAX_LIMIT")
    public void setPartnerApiMaxLimit(String partnerApiMaxLimit) {
        this.partnerApiMaxLimit = partnerApiMaxLimit;
    }

    @JsonProperty("PARTNER_API_MIN_LIMIT")
    public String getPartnerApiMinLimit() {
        return partnerApiMinLimit;
    }

    @JsonProperty("PARTNER_API_MIN_LIMIT")
    public void setPartnerApiMinLimit(String partnerApiMinLimit) {
        this.partnerApiMinLimit = partnerApiMinLimit;
    }

    @JsonProperty("PARTNER_API_PASSTOKEN_ERROR")
    public String getPartnerApiPasstokenError() {
        return partnerApiPasstokenError;
    }

    @JsonProperty("PARTNER_API_PASSTOKEN_ERROR")
    public void setPartnerApiPasstokenError(String partnerApiPasstokenError) {
        this.partnerApiPasstokenError = partnerApiPasstokenError;
    }

    @JsonProperty("PARTNER_API_TIMESTAMP_EXPIRED")
    public String getPartnerApiTimestampExpired() {
        return partnerApiTimestampExpired;
    }

    @JsonProperty("PARTNER_API_TIMESTAMP_EXPIRED")
    public void setPartnerApiTimestampExpired(String partnerApiTimestampExpired) {
        this.partnerApiTimestampExpired = partnerApiTimestampExpired;
    }

    @JsonProperty("PARTNER_API_TOKEN_EXPIRED")
    public String getPartnerApiTokenExpired() {
        return partnerApiTokenExpired;
    }

    @JsonProperty("PARTNER_API_TOKEN_EXPIRED")
    public void setPartnerApiTokenExpired(String partnerApiTokenExpired) {
        this.partnerApiTokenExpired = partnerApiTokenExpired;
    }

    @JsonProperty("PARTNER_API_USER_BLOCKED")
    public String getPartnerApiUserBlocked() {
        return partnerApiUserBlocked;
    }

    @JsonProperty("PARTNER_API_USER_BLOCKED")
    public void setPartnerApiUserBlocked(String partnerApiUserBlocked) {
        this.partnerApiUserBlocked = partnerApiUserBlocked;
    }

    @JsonProperty("PARTNER_API_WRONG_HASH")
    public String getPartnerApiWrongHash() {
        return partnerApiWrongHash;
    }

    @JsonProperty("PARTNER_API_WRONG_HASH")
    public void setPartnerApiWrongHash(String partnerApiWrongHash) {
        this.partnerApiWrongHash = partnerApiWrongHash;
    }

    @JsonProperty("PARTNER_API_WRONG_LOGIN_EMAIL")
    public String getPartnerApiWrongLoginEmail() {
        return partnerApiWrongLoginEmail;
    }

    @JsonProperty("PARTNER_API_WRONG_LOGIN_EMAIL")
    public void setPartnerApiWrongLoginEmail(String partnerApiWrongLoginEmail) {
        this.partnerApiWrongLoginEmail = partnerApiWrongLoginEmail;
    }

    @JsonProperty("PARTNER_API_WRONG_ACCESS")
    public String getPartnerApiWrongAccess() {
        return partnerApiWrongAccess;
    }

    @JsonProperty("PARTNER_API_WRONG_ACCESS")
    public void setPartnerApiWrongAccess(String partnerApiWrongAccess) {
        this.partnerApiWrongAccess = partnerApiWrongAccess;
    }

    @JsonProperty("PARTNER_NOT_FOUND")
    public String getPartnerNotFound() {
        return partnerNotFound;
    }

    @JsonProperty("PARTNER_NOT_FOUND")
    public void setPartnerNotFound(String partnerNotFound) {
        this.partnerNotFound = partnerNotFound;
    }

    @JsonProperty("PARTNER_COMMERCIAL_FEE_NOT_FOUND")
    public String getPartnerCommercialFeeNotFound() {
        return partnerCommercialFeeNotFound;
    }

    @JsonProperty("PARTNER_COMMERCIAL_FEE_NOT_FOUND")
    public void setPartnerCommercialFeeNotFound(String partnerCommercialFeeNotFound) {
        this.partnerCommercialFeeNotFound = partnerCommercialFeeNotFound;
    }

    @JsonProperty("SELECTION_NOT_FOUND")
    public String getSelectionNotFound() {
        return selectionNotFound;
    }

    @JsonProperty("SELECTION_NOT_FOUND")
    public void setSelectionNotFound(String selectionNotFound) {
        this.selectionNotFound = selectionNotFound;
    }

    @JsonProperty("SELECTION_COUNT_MISMATCH")
    public String getSelectionCountMismatch() {
        return selectionCountMismatch;
    }

    @JsonProperty("SELECTION_COUNT_MISMATCH")
    public void setSelectionCountMismatch(String selectionCountMismatch) {
        this.selectionCountMismatch = selectionCountMismatch;
    }

    @JsonProperty("EVENT_SUSPENDED")
    public String getEventSuspended() {
        return eventSuspended;
    }

    @JsonProperty("EVENT_SUSPENDED")
    public void setEventSuspended(String eventSuspended) {
        this.eventSuspended = eventSuspended;
    }

    @JsonProperty("SPORT_MISMATCH")
    public String getSportMismatch() {
        return sportMismatch;
    }

    @JsonProperty("SPORT_MISMATCH")
    public void setSportMismatch(String sportMismatch) {
        this.sportMismatch = sportMismatch;
    }

    @JsonProperty("SPORT_NOT_SUPPORTED_FOR_THE_PARTNER")
    public String getSportNotSupportedForThePartner() {
        return sportNotSupportedForThePartner;
    }

    @JsonProperty("SPORT_NOT_SUPPORTED_FOR_THE_PARTNER")
    public void setSportNotSupportedForThePartner(String sportNotSupportedForThePartner) {
        this.sportNotSupportedForThePartner = sportNotSupportedForThePartner;
    }

    @JsonProperty("PAYMENT_RESTRICTION_EXCEPTION")
    public String getPaymentRestrictionException() {
        return paymentRestrictionException;
    }

    @JsonProperty("PAYMENT_RESTRICTION_EXCEPTION")
    public void setPaymentRestrictionException(String paymentRestrictionException) {
        this.paymentRestrictionException = paymentRestrictionException;
    }

    @JsonProperty("CLIENT_LIMIT_EXCEPTION")
    public String getClientLimitException() {
        return clientLimitException;
    }

    @JsonProperty("CLIENT_LIMIT_EXCEPTION")
    public void setClientLimitException(String clientLimitException) {
        this.clientLimitException = clientLimitException;
    }

    @JsonProperty("WRONG_CURRENCY_CODE")
    public String getWrongCurrencyCode() {
        return wrongCurrencyCode;
    }

    @JsonProperty("WRONG_CURRENCY_CODE")
    public void setWrongCurrencyCode(String wrongCurrencyCode) {
        this.wrongCurrencyCode = wrongCurrencyCode;
    }

    @JsonProperty("CURRENCY_NOT_SUPPORTED")
    public String getCurrencyNotSupported() {
        return currencyNotSupported;
    }

    @JsonProperty("CURRENCY_NOT_SUPPORTED")
    public void setCurrencyNotSupported(String currencyNotSupported) {
        this.currencyNotSupported = currencyNotSupported;
    }

    @JsonProperty("NEGATIVE_AMOUNT")
    public String getNegativeAmount() {
        return negativeAmount;
    }

    @JsonProperty("NEGATIVE_AMOUNT")
    public void setNegativeAmount(String negativeAmount) {
        this.negativeAmount = negativeAmount;
    }

    @JsonProperty("BET_SELECTIONS_CANNOT_BE_CHAINED_TOGETHER")
    public String getBetSelectionsCannotBeChainedTogether() {
        return betSelectionsCannotBeChainedTogether;
    }

    @JsonProperty("BET_SELECTIONS_CANNOT_BE_CHAINED_TOGETHER")
    public void setBetSelectionsCannotBeChainedTogether(String betSelectionsCannotBeChainedTogether) {
        this.betSelectionsCannotBeChainedTogether = betSelectionsCannotBeChainedTogether;
    }

    @JsonProperty("BONUS_NOT_FOUND")
    public String getBonusNotFound() {
        return bonusNotFound;
    }

    @JsonProperty("BONUS_NOT_FOUND")
    public void setBonusNotFound(String bonusNotFound) {
        this.bonusNotFound = bonusNotFound;
    }

    @JsonProperty("PARTNER_BONUS_NOT_FOUND")
    public String getPartnerBonusNotFound() {
        return partnerBonusNotFound;
    }

    @JsonProperty("PARTNER_BONUS_NOT_FOUND")
    public void setPartnerBonusNotFound(String partnerBonusNotFound) {
        this.partnerBonusNotFound = partnerBonusNotFound;
    }

    @JsonProperty("CLIENT_HAS_ACTIVE_BONUS")
    public String getClientHasActiveBonus() {
        return clientHasActiveBonus;
    }

    @JsonProperty("CLIENT_HAS_ACTIVE_BONUS")
    public void setClientHasActiveBonus(String clientHasActiveBonus) {
        this.clientHasActiveBonus = clientHasActiveBonus;
    }

    @JsonProperty("INVALID_CLIENT_BONUS")
    public String getInvalidClientBonus() {
        return invalidClientBonus;
    }

    @JsonProperty("INVALID_CLIENT_BONUS")
    public void setInvalidClientBonus(String invalidClientBonus) {
        this.invalidClientBonus = invalidClientBonus;
    }

    @JsonProperty("CLIENT_RESTRICTED_FOR_ACTION")
    public String getClientRestrictedForAction() {
        return clientRestrictedForAction;
    }

    @JsonProperty("CLIENT_RESTRICTED_FOR_ACTION")
    public void setClientRestrictedForAction(String clientRestrictedForAction) {
        this.clientRestrictedForAction = clientRestrictedForAction;
    }

    @JsonProperty("EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_ORDINAR")
    public String getEventsCanBeIncludedOnlyInTheOrdinar() {
        return eventsCanBeIncludedOnlyInTheOrdinar;
    }

    @JsonProperty("EVENTS_CAN_BE_INCLUDED_ONLY_IN_THE_ORDINAR")
    public void setEventsCanBeIncludedOnlyInTheOrdinar(String eventsCanBeIncludedOnlyInTheOrdinar) {
        this.eventsCanBeIncludedOnlyInTheOrdinar = eventsCanBeIncludedOnlyInTheOrdinar;
    }

    @JsonProperty("PARTNER_NOT_SUPPORTED_TEST_CLIENT")
    public String getPartnerNotSupportedTestClient() {
        return partnerNotSupportedTestClient;
    }

    @JsonProperty("PARTNER_NOT_SUPPORTED_TEST_CLIENT")
    public void setPartnerNotSupportedTestClient(String partnerNotSupportedTestClient) {
        this.partnerNotSupportedTestClient = partnerNotSupportedTestClient;
    }

    @JsonProperty("PARTNER_NOT_USING_LOYALTY_PROGRAM")
    public String getPartnerNotUsingLoyaltyProgram() {
        return partnerNotUsingLoyaltyProgram;
    }

    @JsonProperty("PARTNER_NOT_USING_LOYALTY_PROGRAM")
    public void setPartnerNotUsingLoyaltyProgram(String partnerNotUsingLoyaltyProgram) {
        this.partnerNotUsingLoyaltyProgram = partnerNotUsingLoyaltyProgram;
    }

    @JsonProperty("POINT_EXCHANGE_RANGE_EXCEED")
    public String getPointExchangeRangeExceed() {
        return pointExchangeRangeExceed;
    }

    @JsonProperty("POINT_EXCHANGE_RANGE_EXCEED")
    public void setPointExchangeRangeExceed(String pointExchangeRangeExceed) {
        this.pointExchangeRangeExceed = pointExchangeRangeExceed;
    }

    @JsonProperty("CLIENT_NOT_USING_LOYALTY_PROGRAM")
    public String getClientNotUsingLoyaltyProgram() {
        return clientNotUsingLoyaltyProgram;
    }

    @JsonProperty("CLIENT_NOT_USING_LOYALTY_PROGRAM")
    public void setClientNotUsingLoyaltyProgram(String clientNotUsingLoyaltyProgram) {
        this.clientNotUsingLoyaltyProgram = clientNotUsingLoyaltyProgram;
    }

    @JsonProperty("PARTNER_LIMIT_AMOUNT_EXCEED")
    public String getPartnerLimitAmountExceed() {
        return partnerLimitAmountExceed;
    }

    @JsonProperty("PARTNER_LIMIT_AMOUNT_EXCEED")
    public void setPartnerLimitAmountExceed(String partnerLimitAmountExceed) {
        this.partnerLimitAmountExceed = partnerLimitAmountExceed;
    }

    @JsonProperty("CLIENT_HAS_ACCEPTED_BONUS")
    public String getClientHasAcceptedBonus() {
        return clientHasAcceptedBonus;
    }

    @JsonProperty("CLIENT_HAS_ACCEPTED_BONUS")
    public void setClientHasAcceptedBonus(String clientHasAcceptedBonus) {
        this.clientHasAcceptedBonus = clientHasAcceptedBonus;
    }

    @JsonProperty("PARTNER_API_ERROR")
    public String getPartnerApiError() {
        return partnerApiError;
    }

    @JsonProperty("PARTNER_API_ERROR")
    public void setPartnerApiError(String partnerApiError) {
        this.partnerApiError = partnerApiError;
    }

    @JsonProperty("TEAM_NOT_FOUND")
    public String getTeamNotFound() {
        return teamNotFound;
    }

    @JsonProperty("TEAM_NOT_FOUND")
    public void setTeamNotFound(String teamNotFound) {
        this.teamNotFound = teamNotFound;
    }

    @JsonProperty("INVALID_CLIENT_VERIFICATION_STEP_STATE")
    public String getInvalidClientVerificationStepState() {
        return invalidClientVerificationStepState;
    }

    @JsonProperty("INVALID_CLIENT_VERIFICATION_STEP_STATE")
    public void setInvalidClientVerificationStepState(String invalidClientVerificationStepState) {
        this.invalidClientVerificationStepState = invalidClientVerificationStepState;
    }

    @JsonProperty("PARTNER_SPORTS_BOOK_CURRENCY_SETTING")
    public String getPartnerSportsBookCurrencySetting() {
        return partnerSportsBookCurrencySetting;
    }

    @JsonProperty("PARTNER_SPORTS_BOOK_CURRENCY_SETTING")
    public void setPartnerSportsBookCurrencySetting(String partnerSportsBookCurrencySetting) {
        this.partnerSportsBookCurrencySetting = partnerSportsBookCurrencySetting;
    }

    @JsonProperty("CLIENT_BET_MIN_STAKE_LIMIT_ERROR")
    public String getClientBetMinStakeLimitError() {
        return clientBetMinStakeLimitError;
    }

    @JsonProperty("CLIENT_BET_MIN_STAKE_LIMIT_ERROR")
    public void setClientBetMinStakeLimitError(String clientBetMinStakeLimitError) {
        this.clientBetMinStakeLimitError = clientBetMinStakeLimitError;
    }

    @JsonProperty("MAX_DEPOSIT_REQUEST_SUM")
    public String getMaxDepositRequestSum() {
        return maxDepositRequestSum;
    }

    @JsonProperty("MAX_DEPOSIT_REQUEST_SUM")
    public void setMaxDepositRequestSum(String maxDepositRequestSum) {
        this.maxDepositRequestSum = maxDepositRequestSum;
    }

    @JsonProperty("EMAIL_WRONG_HASH")
    public String getEmailWrongHash() {
        return emailWrongHash;
    }

    @JsonProperty("EMAIL_WRONG_HASH")
    public void setEmailWrongHash(String emailWrongHash) {
        this.emailWrongHash = emailWrongHash;
    }

    @JsonProperty("CLIENT_ALREADY_SELF_EXCLUDED")
    public String getClientAlreadySelfExcluded() {
        return clientAlreadySelfExcluded;
    }

    @JsonProperty("CLIENT_ALREADY_SELF_EXCLUDED")
    public void setClientAlreadySelfExcluded(String clientAlreadySelfExcluded) {
        this.clientAlreadySelfExcluded = clientAlreadySelfExcluded;
    }

    @JsonProperty("TRANSACTION_AMOUNT_EXCEEDS_FROZEN_MONEY")
    public String getTransactionAmountExceedsFrozenMoney() {
        return transactionAmountExceedsFrozenMoney;
    }

    @JsonProperty("TRANSACTION_AMOUNT_EXCEEDS_FROZEN_MONEY")
    public void setTransactionAmountExceedsFrozenMoney(String transactionAmountExceedsFrozenMoney) {
        this.transactionAmountExceedsFrozenMoney = transactionAmountExceedsFrozenMoney;
    }

    @JsonProperty("WRONG_HASH")
    public String getWrongHash() {
        return wrongHash;
    }

    @JsonProperty("WRONG_HASH")
    public void setWrongHash(String wrongHash) {
        this.wrongHash = wrongHash;
    }

    @JsonProperty("ACCEPTED")
    public String getAccepted() {
        return accepted;
    }

    @JsonProperty("ACCEPTED")
    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    @JsonProperty("PARTNER_MISMATCH")
    public String getPartnerMismatch() {
        return partnerMismatch;
    }

    @JsonProperty("PARTNER_MISMATCH")
    public void setPartnerMismatch(String partnerMismatch) {
        this.partnerMismatch = partnerMismatch;
    }

    @JsonProperty("MATCH_NOT_VISIBLE")
    public String getMatchNotVisible() {
        return matchNotVisible;
    }

    @JsonProperty("MATCH_NOT_VISIBLE")
    public void setMatchNotVisible(String matchNotVisible) {
        this.matchNotVisible = matchNotVisible;
    }

    @JsonProperty("LOYALTY_LEVEL_NOT_FOUNT")
    public String getLoyaltyLevelNotFount() {
        return loyaltyLevelNotFount;
    }

    @JsonProperty("LOYALTY_LEVEL_NOT_FOUNT")
    public void setLoyaltyLevelNotFount(String loyaltyLevelNotFount) {
        this.loyaltyLevelNotFount = loyaltyLevelNotFount;
    }

    @JsonProperty("PLACED_ON_HOLD")
    public String getPlacedOnHold() {
        return placedOnHold;
    }

    @JsonProperty("PLACED_ON_HOLD")
    public void setPlacedOnHold(String placedOnHold) {
        this.placedOnHold = placedOnHold;
    }

    @JsonProperty("ODDS_1000")
    public String getOdds1000() {
        return odds1000;
    }

    @JsonProperty("ODDS_1000")
    public void setOdds1000(String odds1000) {
        this.odds1000 = odds1000;
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
