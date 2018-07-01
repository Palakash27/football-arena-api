package com.aakashpal.footballersarena.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "footballers")
public class PlayerModel {

	@Column(name = "Name")
	@Id
	private String name;

	@Column(name = "Nationality")
	private String nationality;

	@Column(name = "National_Position")
	private String nationalPosition;

	@Column(name = "National_Kit")
	private String nationalKit;

	@Column(name = "Club")
	private String club;

	@Column(name = "Club_Position")
	private String clubPosition;

	@Column(name = "Club_Kit")
	private String clubKit;

	@Column(name = "Club_Joining")
	private String clubJoining;

	@Column(name = "Contract_Expiry")
	private String contractExpiry;

	@Column(name = "Rating")
	private Integer rating;

	@Column(name = "Height")
	private String height;

	@Column(name = "Weight")
	private String weight;

	@Column(name = "Preffered_Foot")
	private String prefferedFoot;

	@Column(name = "Birth_Date")
	private String birthDate;

	@Column(name = "Age")
	private Integer age;

	@Column(name = "Preffered_Position")
	private String prefferedPosition;

	@Column(name = "Work_Rate")
	private String workRate;

	@Column(name = "Weak_foot")
	private Integer weakFoot;

	@Column(name = "Skill_Moves")
	private Integer skillMoves;

	@Column(name = "Ball_Control")
	private Integer ballControl;

	@Column(name = "Dribbling")
	private Integer dribbling;

	@Column(name = "Marking")
	private Integer marking;

	@Column(name = "Sliding_Tackle")
	private Integer slidingTackle;

	@Column(name = "Standing_Tackle")
	private Integer standingTackle;

	@Column(name = "Aggression")
	private Integer aggression;

	@Column(name = "Reactions")
	private Integer reactions;

	@Column(name = "Attacking_Position")
	private Integer attackingPosition;

	@Column(name = "Interceptions")
	private Integer interceptions;

	@Column(name = "Vision")
	private Integer vision;

	@Column(name = "Composure")
	private Integer composure;

	@Column(name = "Crossing")
	private Integer crossing;

	@Column(name = "Short_Pass")
	private Integer shortPass;

	@Column(name = "Long_Pass")
	private Integer longPass;

	@Column(name = "Acceleration")
	private Integer acceleration;

	@Column(name = "Speed")
	private Integer speed;

	@Column(name = "Stamina")
	private Integer stamina;

	@Column(name = "Strength")
	private Integer strength;

	@Column(name = "Balance")
	private Integer balance;

	@Column(name = "Agility")
	private Integer agility;

	@Column(name = "Jumping")
	private Integer jumping;

	@Column(name = "Heading")
	private Integer heading;

	@Column(name = "Shot_Power")
	private Integer shotPower;

	@Column(name = "Finishing")
	private Integer finishing;

	@Column(name = "Long_Shots")
	private Integer longShots;

	@Column(name = "Curve")
	private Integer curve;

	@Column(name = "Freekick_Accuracy")
	private Integer freekickAccuracy;

	@Column(name = "Penalties")
	private Integer penalties;

	@Column(name = "Volleys")
	private Integer volleys;

	@Column(name = "GK_Positioning")
	private Integer gkPositioning;

	@Column(name = "GK_Diving")
	private Integer gkDiving;

	@Column(name = "GK_Kicking")
	private Integer gkKicking;

	@Column(name = "GK_Handling")
	private Integer gkHandling;

	@Column(name = "GK_Reflexes")
	private Integer gkReflexes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNationalPosition() {
		return nationalPosition;
	}

	public void setNationalPosition(String nationalPosition) {
		this.nationalPosition = nationalPosition;
	}

	public String getNationalKit() {
		return nationalKit;
	}

	public void setNationalKit(String nationalKit) {
		this.nationalKit = nationalKit;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getClubPosition() {
		return clubPosition;
	}

	public void setClubPosition(String clubPosition) {
		this.clubPosition = clubPosition;
	}

	public String getClubKit() {
		return clubKit;
	}

	public void setClubKit(String clubKit) {
		this.clubKit = clubKit;
	}

	public String getClubJoining() {
		return clubJoining;
	}

	public void setClubJoining(String clubJoining) {
		this.clubJoining = clubJoining;
	}

	public String getContractExpiry() {
		return contractExpiry;
	}

	public void setContractExpiry(String contractExpiry) {
		this.contractExpiry = contractExpiry;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPrefferedFoot() {
		return prefferedFoot;
	}

	public void setPrefferedFoot(String prefferedFoot) {
		this.prefferedFoot = prefferedFoot;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPrefferedPosition() {
		return prefferedPosition;
	}

	public void setPrefferedPosition(String prefferedPosition) {
		this.prefferedPosition = prefferedPosition;
	}

	public String getWorkRate() {
		return workRate;
	}

	public void setWorkRate(String workRate) {
		this.workRate = workRate;
	}

	public Integer getWeakFoot() {
		return weakFoot;
	}

	public void setWeakFoot(Integer weakFoot) {
		this.weakFoot = weakFoot;
	}

	public Integer getSkillMoves() {
		return skillMoves;
	}

	public void setSkillMoves(Integer skillMoves) {
		this.skillMoves = skillMoves;
	}

	public Integer getBallControl() {
		return ballControl;
	}

	public void setBallControl(Integer ballControl) {
		this.ballControl = ballControl;
	}

	public Integer getDribbling() {
		return dribbling;
	}

	public void setDribbling(Integer dribbling) {
		this.dribbling = dribbling;
	}

	public Integer getMarking() {
		return marking;
	}

	public void setMarking(Integer marking) {
		this.marking = marking;
	}

	public Integer getSlidingTackle() {
		return slidingTackle;
	}

	public void setSlidingTackle(Integer slidingTackle) {
		this.slidingTackle = slidingTackle;
	}

	public Integer getStandingTackle() {
		return standingTackle;
	}

	public void setStandingTackle(Integer standingTackle) {
		this.standingTackle = standingTackle;
	}

	public Integer getAggression() {
		return aggression;
	}

	public void setAggression(Integer aggression) {
		this.aggression = aggression;
	}

	public Integer getReactions() {
		return reactions;
	}

	public void setReactions(Integer reactions) {
		this.reactions = reactions;
	}

	public Integer getAttackingPosition() {
		return attackingPosition;
	}

	public void setAttackingPosition(Integer attackingPosition) {
		this.attackingPosition = attackingPosition;
	}

	public Integer getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(Integer interceptions) {
		this.interceptions = interceptions;
	}

	public Integer getVision() {
		return vision;
	}

	public void setVision(Integer vision) {
		this.vision = vision;
	}

	public Integer getComposure() {
		return composure;
	}

	public void setComposure(Integer composure) {
		this.composure = composure;
	}

	public Integer getCrossing() {
		return crossing;
	}

	public void setCrossing(Integer crossing) {
		this.crossing = crossing;
	}

	public Integer getShortPass() {
		return shortPass;
	}

	public void setShortPass(Integer shortPass) {
		this.shortPass = shortPass;
	}

	public Integer getLongPass() {
		return longPass;
	}

	public void setLongPass(Integer longPass) {
		this.longPass = longPass;
	}

	public Integer getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Integer acceleration) {
		this.acceleration = acceleration;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getStamina() {
		return stamina;
	}

	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getAgility() {
		return agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public Integer getJumping() {
		return jumping;
	}

	public void setJumping(Integer jumping) {
		this.jumping = jumping;
	}

	public Integer getHeading() {
		return heading;
	}

	public void setHeading(Integer heading) {
		this.heading = heading;
	}

	public Integer getShotPower() {
		return shotPower;
	}

	public void setShotPower(Integer shotPower) {
		this.shotPower = shotPower;
	}

	public Integer getFinishing() {
		return finishing;
	}

	public void setFinishing(Integer finishing) {
		this.finishing = finishing;
	}

	public Integer getLongShots() {
		return longShots;
	}

	public void setLongShots(Integer longShots) {
		this.longShots = longShots;
	}

	public Integer getCurve() {
		return curve;
	}

	public void setCurve(Integer curve) {
		this.curve = curve;
	}

	public Integer getFreekickAccuracy() {
		return freekickAccuracy;
	}

	public void setFreekickAccuracy(Integer freekickAccuracy) {
		this.freekickAccuracy = freekickAccuracy;
	}

	public Integer getPenalties() {
		return penalties;
	}

	public void setPenalties(Integer penalties) {
		this.penalties = penalties;
	}

	public Integer getVolleys() {
		return volleys;
	}

	public void setVolleys(Integer volleys) {
		this.volleys = volleys;
	}

	public Integer getGkPositioning() {
		return gkPositioning;
	}

	public void setGkPositioning(Integer gkPositioning) {
		this.gkPositioning = gkPositioning;
	}

	public Integer getGkDiving() {
		return gkDiving;
	}

	public void setGkDiving(Integer gkDiving) {
		this.gkDiving = gkDiving;
	}

	public Integer getGkKicking() {
		return gkKicking;
	}

	public void setGkKicking(Integer gkKicking) {
		this.gkKicking = gkKicking;
	}

	public Integer getGkHandling() {
		return gkHandling;
	}

	public void setGkHandling(Integer gkHandling) {
		this.gkHandling = gkHandling;
	}

	public Integer getGkReflexes() {
		return gkReflexes;
	}

	public void setGkReflexes(Integer gkReflexes) {
		this.gkReflexes = gkReflexes;
	}

}
