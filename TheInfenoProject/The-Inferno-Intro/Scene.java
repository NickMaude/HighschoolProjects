// <editor-fold defaultstate="collapsed" desc="imports">
import java.lang.Thread;
import org.lgna.story.*;
import org.lgna.story.resources.prop.WaterTankWellResource;
import org.lgna.story.resources.sims2.AdultPersonResource;
import org.lgna.story.resources.prop.RiverRockResource;
import org.lgna.story.resources.prop.WaterTankWallResource;
import org.lgna.story.resources.sims2.MaleAdultHairPeak;
import org.lgna.story.resources.sims2.MaleAdultHairHatViking;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.prop.RockyOutcropResource;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitShorts;
import org.lgna.story.resources.sims2.MaleAdultHairHatBucket;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitDressShirtShortsSocksShoes;
import org.lgna.story.resources.prop.FlatRocksResource;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitSweats;
import org.lgna.story.resources.sims2.AdultFullBodyOutfitAstronaut;
import org.lgna.story.resources.sims2.ElderPersonResource;
import org.lgna.story.resources.prop.WaterTankTowerResource;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitShorts;
import org.lgna.story.resources.sims2.MaleAdultHairBald;
import org.lgna.story.resources.sims2.MaleAdultHairRound;
import static org.lgna.common.ThreadUtilities.doTogether;
// </editor-fold>
//*******************************************************************************
//boatgame.java
//created by 
//  Nick Maude useing Alice3.0 and NetBeansIDE 8.2
//*******************************************************************************
class Scene extends SScene {

    /* Construct new Scene */
    public Scene() {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    /* Procedures and functions for this scene */
    public void myFirstMethod() {
        intro();
        SinnerConverstion();
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final FlatRocks flatRocks = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks2 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks3 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks4 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks5 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks6 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks7 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks8 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks9 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks10 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks11 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks12 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks13 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks14 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks15 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks16 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks17 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks18 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks19 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks20 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks21 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks22 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks23 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks24 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks25 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks26 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks27 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks28 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks29 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks30 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks31 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks32 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks33 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks34 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks35 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks36 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks37 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks38 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks39 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks40 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks41 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks42 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks43 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks44 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks45 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks46 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks47 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks48 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks49 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks50 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks51 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks52 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks53 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks54 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks55 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks56 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks57 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks58 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks59 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks60 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks61 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks62 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks63 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks64 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks65 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final Docks docks = new Docks();
    private final FlatRocks flatRocks66 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks67 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks68 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks69 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks70 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks71 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks72 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks73 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks74 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks75 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks76 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks77 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks78 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks79 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks80 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks81 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks82 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks83 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks84 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks85 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks86 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FishingBoat fishingBoat = new FishingBoat();
    private final RiverRock riverRock = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final RiverRock riverRock2 = new RiverRock(RiverRockResource.BIG_ROCK);
    private final RiverRock riverRock3 = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final RiverRock riverRock4 = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final RiverRock riverRock5 = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final RiverRock riverRock6 = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final RockyOutcrop rockyOutcrop = new RockyOutcrop(RockyOutcropResource.MEDIUM);
    private final RockyOutcrop rockyOutcrop2 = new RockyOutcrop(RockyOutcropResource.SMALL);
    private final RockyOutcrop rockyOutcrop3 = new RockyOutcrop(RockyOutcropResource.LARGE);
    private final RockyOutcrop rockyOutcrop4 = new RockyOutcrop(RockyOutcropResource.LARGE);
    private final Skull skull = new Skull();
    private final Skull skull2 = new Skull();
    private final Skull skull3 = new Skull();
    private final Skull skull4 = new Skull();
    private final AdultPerson adultPerson = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.DARK_BROWN, MaleAdultHairRound.BLACK, 0.980667, MaleAdultFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_23));
    private final FlatRocks flatRocks87 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks88 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks89 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final RockyOutcrop rockyOutcrop5 = new RockyOutcrop(RockyOutcropResource.SMALL);
    private final RiverRock riverRock7 = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final AdultPerson adultPerson2 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.GRAY, MaleAdultHairHatViking.WHITE, 0.569909, MaleAdultFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_04));
    private final ElderPerson elderPerson = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.DARK_BROWN, MaleAdultHairHatBucket.BLOND_BLACK_HAT, 0.216397, MaleElderFullBodyOutfitSweats.RED_RUN, BaseFace.HUMAN_02));
    private final FlatRocks flatRocks90 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks91 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks92 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks93 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks94 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks95 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks96 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks97 = new FlatRocks(FlatRocksResource.ROCKS3);
    private final FlatRocks flatRocks98 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks99 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks100 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks101 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks102 = new FlatRocks(FlatRocksResource.ROCKS2);
    private final FlatRocks flatRocks103 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks104 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final FlatRocks flatRocks105 = new FlatRocks(FlatRocksResource.ROCKS1);
    private final WaterTankWall waterTankWall = new WaterTankWall(WaterTankWallResource.ARCH_GRAY);
    private final WaterTankTower waterTankTower = new WaterTankTower(WaterTankTowerResource.GRAY);
    private final WaterTankTower waterTankTower2 = new WaterTankTower(WaterTankTowerResource.GRAY);
    private final WaterTankTower waterTankTower3 = new WaterTankTower(WaterTankTowerResource.GRAY);
    private final WaterTankWell waterTankWell = new WaterTankWell(WaterTankWellResource.NO_WATER_GRAY);
    private final WaterTankTower waterTankTower4 = new WaterTankTower(WaterTankTowerResource.GRAY);
    private final WaterTankTower waterTankTower5 = new WaterTankTower(WaterTankTowerResource.GRAY);
    private final ElderPerson dante = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GREEN, MaleAdultHairRound.GREY, 0.124854, MaleElderFullBodyOutfitDressShirtShortsSocksShoes.PURPLE_HAWAIIAN_TAN_SHORTS, BaseFace.HUMAN_09));
    private final AdultPerson qwdadscsfdgdfgh = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.DARK_BLUE, MaleAdultHairPeak.GREY, 0.635393, AdultFullBodyOutfitAstronaut.WHITE, BaseFace.HUMAN_22));
    private final ElderPerson sinner = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GREEN, MaleAdultHairBald.GREY, 0.0424265, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_15));
    private final Alien alien = new Alien();
    private final Alien alien2 = new Alien();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup  */">
    private void performCustomSetup() {
//Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
//DO NOT EDIT
//This code is automatically generated.  Any work you perform in this method will be overwritten.
//DO NOT EDIT
        this.setAtmosphereColor(new Color(0.0667, 0.118, 0.122));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(new Color(0.0, 1.0, 0.741));
        this.setFogDensity(0.27);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.SWAMP);
        this.ground.setOpacity(0.7);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-0.00105546, -0.998567, -0.021511, 0.0489956));
        this.camera.setPositionRelativeToVehicle(new Position(-0.826, 2.8, -32.3));
        this.flatRocks.setPaint(Color.WHITE);
        this.flatRocks.setOpacity(1.0);
        this.flatRocks.setName("flatRocks");
        this.flatRocks.setVehicle(this);
        this.flatRocks.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.flatRocks.setPositionRelativeToVehicle(new Position(1.27, 0.0, -2.57));
        this.flatRocks2.setPaint(Color.WHITE);
        this.flatRocks2.setOpacity(1.0);
        this.flatRocks2.setName("flatRocks2");
        this.flatRocks2.setVehicle(this);
        this.flatRocks2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.flatRocks2.setPositionRelativeToVehicle(new Position(1.4, 0.0, -3.19));
        this.flatRocks3.setPaint(Color.WHITE);
        this.flatRocks3.setOpacity(1.0);
        this.flatRocks3.setName("flatRocks3");
        this.flatRocks3.setVehicle(this);
        this.flatRocks3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.flatRocks3.setPositionRelativeToVehicle(new Position(1.11, 0.0, 2.16));
        this.flatRocks4.setPaint(Color.WHITE);
        this.flatRocks4.setOpacity(1.0);
        this.flatRocks4.setName("flatRocks4");
        this.flatRocks4.setVehicle(this);
        this.flatRocks4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks4.setPositionRelativeToVehicle(new Position(3.35, 0.0, -2.23));
        this.flatRocks5.setPaint(Color.WHITE);
        this.flatRocks5.setOpacity(1.0);
        this.flatRocks5.setName("flatRocks5");
        this.flatRocks5.setVehicle(this);
        this.flatRocks5.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks5.setPositionRelativeToVehicle(new Position(2.26, 0.0, -6.27));
        this.flatRocks6.setPaint(Color.WHITE);
        this.flatRocks6.setOpacity(1.0);
        this.flatRocks6.setName("flatRocks6");
        this.flatRocks6.setVehicle(this);
        this.flatRocks6.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks6.setPositionRelativeToVehicle(new Position(0.949, 0.0, 1.13));
        this.flatRocks7.setPaint(Color.WHITE);
        this.flatRocks7.setOpacity(1.0);
        this.flatRocks7.setName("flatRocks7");
        this.flatRocks7.setVehicle(this);
        this.flatRocks7.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks7.setPositionRelativeToVehicle(new Position(4.18, 0.0, -3.15));
        this.flatRocks8.setPaint(Color.WHITE);
        this.flatRocks8.setOpacity(1.0);
        this.flatRocks8.setName("flatRocks8");
        this.flatRocks8.setVehicle(this);
        this.flatRocks8.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks8.setPositionRelativeToVehicle(new Position(3.84, 0.0, -4.52));
        this.flatRocks9.setPaint(Color.WHITE);
        this.flatRocks9.setOpacity(1.0);
        this.flatRocks9.setName("flatRocks9");
        this.flatRocks9.setVehicle(this);
        this.flatRocks9.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks9.setPositionRelativeToVehicle(new Position(-0.0733, 0.0, -3.83));
        this.flatRocks10.setPaint(Color.WHITE);
        this.flatRocks10.setOpacity(1.0);
        this.flatRocks10.setName("flatRocks10");
        this.flatRocks10.setVehicle(this);
        this.flatRocks10.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks10.setPositionRelativeToVehicle(new Position(1.65, 0.0, -3.02));
        this.flatRocks11.setPaint(Color.WHITE);
        this.flatRocks11.setOpacity(1.0);
        this.flatRocks11.setName("flatRocks11");
        this.flatRocks11.setVehicle(this);
        this.flatRocks11.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks11.setPositionRelativeToVehicle(new Position(1.45, 0.0, -5.57));
        this.flatRocks12.setPaint(Color.WHITE);
        this.flatRocks12.setOpacity(1.0);
        this.flatRocks12.setName("flatRocks12");
        this.flatRocks12.setVehicle(this);
        this.flatRocks12.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks12.setPositionRelativeToVehicle(new Position(1.72, 0.0, -2.27));
        this.flatRocks13.setPaint(Color.WHITE);
        this.flatRocks13.setOpacity(1.0);
        this.flatRocks13.setName("flatRocks13");
        this.flatRocks13.setVehicle(this);
        this.flatRocks13.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks13.setPositionRelativeToVehicle(new Position(1.42, 0.0, -4.29));
        this.flatRocks14.setPaint(Color.WHITE);
        this.flatRocks14.setOpacity(1.0);
        this.flatRocks14.setName("flatRocks14");
        this.flatRocks14.setVehicle(this);
        this.flatRocks14.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks14.setPositionRelativeToVehicle(new Position(2.27, 0.0, -1.27));
        this.flatRocks15.setPaint(Color.WHITE);
        this.flatRocks15.setOpacity(1.0);
        this.flatRocks15.setName("flatRocks15");
        this.flatRocks15.setVehicle(this);
        this.flatRocks15.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks15.setPositionRelativeToVehicle(new Position(2.55, 0.0, 2.87));
        this.flatRocks16.setPaint(Color.WHITE);
        this.flatRocks16.setOpacity(1.0);
        this.flatRocks16.setName("flatRocks16");
        this.flatRocks16.setVehicle(this);
        this.flatRocks16.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks16.setPositionRelativeToVehicle(new Position(2.81, 0.0, 1.11));
        this.flatRocks17.setPaint(Color.WHITE);
        this.flatRocks17.setOpacity(1.0);
        this.flatRocks17.setName("flatRocks17");
        this.flatRocks17.setVehicle(this);
        this.flatRocks17.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks17.setPositionRelativeToVehicle(new Position(6.85, 0.0, 0.763));
        this.flatRocks18.setPaint(Color.WHITE);
        this.flatRocks18.setOpacity(1.0);
        this.flatRocks18.setName("flatRocks18");
        this.flatRocks18.setVehicle(this);
        this.flatRocks18.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks18.setPositionRelativeToVehicle(new Position(-2.48, 0.0, -1.33));
        this.flatRocks19.setPaint(Color.WHITE);
        this.flatRocks19.setOpacity(1.0);
        this.flatRocks19.setName("flatRocks19");
        this.flatRocks19.setVehicle(this);
        this.flatRocks19.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks19.setPositionRelativeToVehicle(new Position(5.79, 0.0, -1.46));
        this.flatRocks20.setPaint(Color.WHITE);
        this.flatRocks20.setOpacity(1.0);
        this.flatRocks20.setName("flatRocks20");
        this.flatRocks20.setVehicle(this);
        this.flatRocks20.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks20.setPositionRelativeToVehicle(new Position(3.13, 0.0, -5.16));
        this.flatRocks21.setPaint(Color.WHITE);
        this.flatRocks21.setOpacity(1.0);
        this.flatRocks21.setName("flatRocks21");
        this.flatRocks21.setVehicle(this);
        this.flatRocks21.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks21.setPositionRelativeToVehicle(new Position(4.47, 0.0, -6.09));
        this.flatRocks22.setPaint(Color.WHITE);
        this.flatRocks22.setOpacity(1.0);
        this.flatRocks22.setName("flatRocks22");
        this.flatRocks22.setVehicle(this);
        this.flatRocks22.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks22.setPositionRelativeToVehicle(new Position(2.58, 0.0, -7.54));
        this.flatRocks23.setPaint(Color.WHITE);
        this.flatRocks23.setOpacity(1.0);
        this.flatRocks23.setName("flatRocks23");
        this.flatRocks23.setVehicle(this);
        this.flatRocks23.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks23.setPositionRelativeToVehicle(new Position(4.41, 0.0, -0.474));
        this.flatRocks24.setPaint(Color.WHITE);
        this.flatRocks24.setOpacity(1.0);
        this.flatRocks24.setName("flatRocks24");
        this.flatRocks24.setVehicle(this);
        this.flatRocks24.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks24.setPositionRelativeToVehicle(new Position(3.76, 0.0, -3.58));
        this.flatRocks25.setPaint(Color.WHITE);
        this.flatRocks25.setOpacity(1.0);
        this.flatRocks25.setName("flatRocks25");
        this.flatRocks25.setVehicle(this);
        this.flatRocks25.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks25.setPositionRelativeToVehicle(new Position(4.81, 0.0, 2.43));
        this.flatRocks26.setPaint(Color.WHITE);
        this.flatRocks26.setOpacity(1.0);
        this.flatRocks26.setName("flatRocks26");
        this.flatRocks26.setVehicle(this);
        this.flatRocks26.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks26.setPositionRelativeToVehicle(new Position(0.887, 0.0, -0.845));
        this.flatRocks27.setPaint(Color.WHITE);
        this.flatRocks27.setOpacity(1.0);
        this.flatRocks27.setName("flatRocks27");
        this.flatRocks27.setVehicle(this);
        this.flatRocks27.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks27.setPositionRelativeToVehicle(new Position(4.21, 0.0, -3.66));
        this.flatRocks28.setPaint(Color.WHITE);
        this.flatRocks28.setOpacity(1.0);
        this.flatRocks28.setName("flatRocks28");
        this.flatRocks28.setVehicle(this);
        this.flatRocks28.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks28.setPositionRelativeToVehicle(new Position(6.66, 0.0, -4.34));
        this.flatRocks29.setPaint(Color.WHITE);
        this.flatRocks29.setOpacity(1.0);
        this.flatRocks29.setName("flatRocks29");
        this.flatRocks29.setVehicle(this);
        this.flatRocks29.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks29.setPositionRelativeToVehicle(new Position(0.468, 0.0, -7.0));
        this.flatRocks30.setPaint(Color.WHITE);
        this.flatRocks30.setOpacity(1.0);
        this.flatRocks30.setName("flatRocks30");
        this.flatRocks30.setVehicle(this);
        this.flatRocks30.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks30.setPositionRelativeToVehicle(new Position(-0.278, 0.0, -6.07));
        this.flatRocks31.setPaint(Color.WHITE);
        this.flatRocks31.setOpacity(1.0);
        this.flatRocks31.setName("flatRocks31");
        this.flatRocks31.setVehicle(this);
        this.flatRocks31.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks31.setPositionRelativeToVehicle(new Position(-0.559, 0.0, -5.32));
        this.flatRocks32.setPaint(Color.WHITE);
        this.flatRocks32.setOpacity(1.0);
        this.flatRocks32.setName("flatRocks32");
        this.flatRocks32.setVehicle(this);
        this.flatRocks32.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks32.setPositionRelativeToVehicle(new Position(2.94, 0.0, -9.05));
        this.flatRocks33.setPaint(Color.WHITE);
        this.flatRocks33.setOpacity(1.0);
        this.flatRocks33.setName("flatRocks33");
        this.flatRocks33.setVehicle(this);
        this.flatRocks33.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks33.setPositionRelativeToVehicle(new Position(6.28, 0.0, -2.21));
        this.flatRocks34.setPaint(Color.WHITE);
        this.flatRocks34.setOpacity(1.0);
        this.flatRocks34.setName("flatRocks34");
        this.flatRocks34.setVehicle(this);
        this.flatRocks34.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks34.setPositionRelativeToVehicle(new Position(6.94, 0.0, 0.702));
        this.flatRocks35.setPaint(Color.WHITE);
        this.flatRocks35.setOpacity(1.0);
        this.flatRocks35.setName("flatRocks35");
        this.flatRocks35.setVehicle(this);
        this.flatRocks35.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks35.setPositionRelativeToVehicle(new Position(1.46, 0.0, -6.01));
        this.flatRocks36.setPaint(Color.WHITE);
        this.flatRocks36.setOpacity(1.0);
        this.flatRocks36.setName("flatRocks36");
        this.flatRocks36.setVehicle(this);
        this.flatRocks36.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks36.setPositionRelativeToVehicle(new Position(3.07, 0.0, -5.1));
        this.flatRocks37.setPaint(Color.WHITE);
        this.flatRocks37.setOpacity(1.0);
        this.flatRocks37.setName("flatRocks37");
        this.flatRocks37.setVehicle(this);
        this.flatRocks37.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks37.setPositionRelativeToVehicle(new Position(4.26, 0.0, -7.66));
        this.flatRocks38.setPaint(Color.WHITE);
        this.flatRocks38.setOpacity(1.0);
        this.flatRocks38.setName("flatRocks38");
        this.flatRocks38.setVehicle(this);
        this.flatRocks38.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks38.setPositionRelativeToVehicle(new Position(3.63, 0.0, -8.37));
        this.flatRocks39.setPaint(Color.WHITE);
        this.flatRocks39.setOpacity(1.0);
        this.flatRocks39.setName("flatRocks39");
        this.flatRocks39.setVehicle(this);
        this.flatRocks39.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks39.setPositionRelativeToVehicle(new Position(2.32, 0.0, -8.33));
        this.flatRocks40.setPaint(Color.WHITE);
        this.flatRocks40.setOpacity(1.0);
        this.flatRocks40.setName("flatRocks40");
        this.flatRocks40.setVehicle(this);
        this.flatRocks40.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks40.setPositionRelativeToVehicle(new Position(-2.18, 0.0, -2.86));
        this.flatRocks41.setPaint(Color.WHITE);
        this.flatRocks41.setOpacity(1.0);
        this.flatRocks41.setName("flatRocks41");
        this.flatRocks41.setVehicle(this);
        this.flatRocks41.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks41.setPositionRelativeToVehicle(new Position(-1.59, 0.0, -6.02));
        this.flatRocks42.setPaint(Color.WHITE);
        this.flatRocks42.setOpacity(1.0);
        this.flatRocks42.setName("flatRocks42");
        this.flatRocks42.setVehicle(this);
        this.flatRocks42.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks42.setPositionRelativeToVehicle(new Position(-1.13, 0.0, -8.8));
        this.flatRocks43.setPaint(Color.WHITE);
        this.flatRocks43.setOpacity(1.0);
        this.flatRocks43.setName("flatRocks43");
        this.flatRocks43.setVehicle(this);
        this.flatRocks43.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks43.setPositionRelativeToVehicle(new Position(5.94, 0.0, -7.46));
        this.flatRocks44.setPaint(Color.WHITE);
        this.flatRocks44.setOpacity(1.0);
        this.flatRocks44.setName("flatRocks44");
        this.flatRocks44.setVehicle(this);
        this.flatRocks44.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks44.setPositionRelativeToVehicle(new Position(6.37, 0.0, -4.85));
        this.flatRocks45.setPaint(Color.WHITE);
        this.flatRocks45.setOpacity(1.0);
        this.flatRocks45.setName("flatRocks45");
        this.flatRocks45.setVehicle(this);
        this.flatRocks45.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks45.setPositionRelativeToVehicle(new Position(1.12, 0.0, -9.5));
        this.flatRocks46.setPaint(Color.WHITE);
        this.flatRocks46.setOpacity(1.0);
        this.flatRocks46.setName("flatRocks46");
        this.flatRocks46.setVehicle(this);
        this.flatRocks46.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks46.setPositionRelativeToVehicle(new Position(-1.19, 0.0, -7.02));
        this.flatRocks47.setPaint(Color.WHITE);
        this.flatRocks47.setOpacity(1.0);
        this.flatRocks47.setName("flatRocks47");
        this.flatRocks47.setVehicle(this);
        this.flatRocks47.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks47.setPositionRelativeToVehicle(new Position(4.3, 0.0, -9.04));
        this.flatRocks48.setPaint(Color.WHITE);
        this.flatRocks48.setOpacity(1.0);
        this.flatRocks48.setName("flatRocks48");
        this.flatRocks48.setVehicle(this);
        this.flatRocks48.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks48.setPositionRelativeToVehicle(new Position(3.47, 0.0, -9.86));
        this.flatRocks49.setPaint(Color.WHITE);
        this.flatRocks49.setOpacity(1.0);
        this.flatRocks49.setName("flatRocks49");
        this.flatRocks49.setVehicle(this);
        this.flatRocks49.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks49.setPositionRelativeToVehicle(new Position(2.42, 0.0, -10.3));
        this.flatRocks50.setPaint(Color.WHITE);
        this.flatRocks50.setOpacity(1.0);
        this.flatRocks50.setName("flatRocks50");
        this.flatRocks50.setVehicle(this);
        this.flatRocks50.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks50.setPositionRelativeToVehicle(new Position(1.42, 0.0, -10.0));
        this.flatRocks51.setPaint(Color.WHITE);
        this.flatRocks51.setOpacity(1.0);
        this.flatRocks51.setName("flatRocks51");
        this.flatRocks51.setVehicle(this);
        this.flatRocks51.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks51.setPositionRelativeToVehicle(new Position(-1.48, 0.0, -10.2));
        this.flatRocks52.setPaint(Color.WHITE);
        this.flatRocks52.setOpacity(1.0);
        this.flatRocks52.setName("flatRocks52");
        this.flatRocks52.setVehicle(this);
        this.flatRocks52.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks52.setPositionRelativeToVehicle(new Position(-3.3, 0.0, -3.0));
        this.flatRocks53.setPaint(Color.WHITE);
        this.flatRocks53.setOpacity(1.0);
        this.flatRocks53.setName("flatRocks53");
        this.flatRocks53.setVehicle(this);
        this.flatRocks53.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks53.setPositionRelativeToVehicle(new Position(-3.27, 0.0, -6.31));
        this.flatRocks54.setPaint(Color.WHITE);
        this.flatRocks54.setOpacity(1.0);
        this.flatRocks54.setName("flatRocks54");
        this.flatRocks54.setVehicle(this);
        this.flatRocks54.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks54.setPositionRelativeToVehicle(new Position(-2.62, 0.0, -9.47));
        this.flatRocks55.setPaint(Color.WHITE);
        this.flatRocks55.setOpacity(1.0);
        this.flatRocks55.setName("flatRocks55");
        this.flatRocks55.setVehicle(this);
        this.flatRocks55.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks55.setPositionRelativeToVehicle(new Position(-4.96, 0.0, -4.28));
        this.flatRocks56.setPaint(Color.WHITE);
        this.flatRocks56.setOpacity(1.0);
        this.flatRocks56.setName("flatRocks56");
        this.flatRocks56.setVehicle(this);
        this.flatRocks56.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks56.setPositionRelativeToVehicle(new Position(-4.6, 0.0, -5.88));
        this.flatRocks57.setPaint(Color.WHITE);
        this.flatRocks57.setOpacity(1.0);
        this.flatRocks57.setName("flatRocks57");
        this.flatRocks57.setVehicle(this);
        this.flatRocks57.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks57.setPositionRelativeToVehicle(new Position(-1.12, 0.0, 0.713));
        this.flatRocks58.setPaint(Color.WHITE);
        this.flatRocks58.setOpacity(1.0);
        this.flatRocks58.setName("flatRocks58");
        this.flatRocks58.setVehicle(this);
        this.flatRocks58.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks58.setPositionRelativeToVehicle(new Position(-3.15, 0.0, -8.27));
        this.flatRocks59.setPaint(Color.WHITE);
        this.flatRocks59.setOpacity(1.0);
        this.flatRocks59.setName("flatRocks59");
        this.flatRocks59.setVehicle(this);
        this.flatRocks59.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks59.setPositionRelativeToVehicle(new Position(0.229, 0.0, -10.7));
        this.flatRocks60.setPaint(Color.WHITE);
        this.flatRocks60.setOpacity(1.0);
        this.flatRocks60.setName("flatRocks60");
        this.flatRocks60.setVehicle(this);
        this.flatRocks60.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks60.setPositionRelativeToVehicle(new Position(2.16, 0.0, -11.2));
        this.flatRocks61.setPaint(Color.WHITE);
        this.flatRocks61.setOpacity(1.0);
        this.flatRocks61.setName("flatRocks61");
        this.flatRocks61.setVehicle(this);
        this.flatRocks61.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks61.setPositionRelativeToVehicle(new Position(5.47, 0.0, -8.84));
        this.flatRocks62.setPaint(Color.WHITE);
        this.flatRocks62.setOpacity(1.0);
        this.flatRocks62.setName("flatRocks62");
        this.flatRocks62.setVehicle(this);
        this.flatRocks62.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks62.setPositionRelativeToVehicle(new Position(-1.28, 0.0, 0.901));
        this.flatRocks63.setPaint(Color.WHITE);
        this.flatRocks63.setOpacity(1.0);
        this.flatRocks63.setName("flatRocks63");
        this.flatRocks63.setVehicle(this);
        this.flatRocks63.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks63.setPositionRelativeToVehicle(new Position(3.72, 0.0, -11.1));
        this.flatRocks64.setPaint(Color.WHITE);
        this.flatRocks64.setOpacity(1.0);
        this.flatRocks64.setName("flatRocks64");
        this.flatRocks64.setVehicle(this);
        this.flatRocks64.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks64.setPositionRelativeToVehicle(new Position(-2.34, 0.0, -10.7));
        this.flatRocks65.setPaint(Color.WHITE);
        this.flatRocks65.setOpacity(1.0);
        this.flatRocks65.setName("flatRocks65");
        this.flatRocks65.setVehicle(this);
        this.flatRocks65.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks65.setPositionRelativeToVehicle(new Position(5.08, 0.0, -11.0));
        this.docks.setPaint(Color.WHITE);
        this.docks.setOpacity(1.0);
        this.docks.setName("docks");
        this.docks.setVehicle(this);
        this.docks.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.docks.setPositionRelativeToVehicle(new Position(2.86, -0.75, 2.11));
        this.flatRocks66.setPaint(Color.WHITE);
        this.flatRocks66.setOpacity(1.0);
        this.flatRocks66.setName("flatRocks66");
        this.flatRocks66.setVehicle(this);
        this.flatRocks66.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks66.setPositionRelativeToVehicle(new Position(6.91, 0.0, -8.23));
        this.flatRocks67.setPaint(Color.WHITE);
        this.flatRocks67.setOpacity(1.0);
        this.flatRocks67.setName("flatRocks67");
        this.flatRocks67.setVehicle(this);
        this.flatRocks67.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks67.setPositionRelativeToVehicle(new Position(8.29, 0.0, -0.329));
        this.flatRocks68.setPaint(Color.WHITE);
        this.flatRocks68.setOpacity(1.0);
        this.flatRocks68.setName("flatRocks68");
        this.flatRocks68.setVehicle(this);
        this.flatRocks68.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks68.setPositionRelativeToVehicle(new Position(1.33, 0.0, -12.2));
        this.flatRocks69.setPaint(Color.WHITE);
        this.flatRocks69.setOpacity(1.0);
        this.flatRocks69.setName("flatRocks69");
        this.flatRocks69.setVehicle(this);
        this.flatRocks69.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks69.setPositionRelativeToVehicle(new Position(-1.39, 0.0, -12.8));
        this.flatRocks70.setPaint(Color.WHITE);
        this.flatRocks70.setOpacity(1.0);
        this.flatRocks70.setName("flatRocks70");
        this.flatRocks70.setVehicle(this);
        this.flatRocks70.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks70.setPositionRelativeToVehicle(new Position(-5.18, 0.0, -7.55));
        this.flatRocks71.setPaint(Color.WHITE);
        this.flatRocks71.setOpacity(1.0);
        this.flatRocks71.setName("flatRocks71");
        this.flatRocks71.setVehicle(this);
        this.flatRocks71.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks71.setPositionRelativeToVehicle(new Position(-4.96, 0.0, -8.61));
        this.flatRocks72.setPaint(Color.WHITE);
        this.flatRocks72.setOpacity(1.0);
        this.flatRocks72.setName("flatRocks72");
        this.flatRocks72.setVehicle(this);
        this.flatRocks72.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks72.setPositionRelativeToVehicle(new Position(-4.57, 0.0, -10.8));
        this.flatRocks73.setPaint(Color.WHITE);
        this.flatRocks73.setOpacity(1.0);
        this.flatRocks73.setName("flatRocks73");
        this.flatRocks73.setVehicle(this);
        this.flatRocks73.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks73.setPositionRelativeToVehicle(new Position(3.26, 0.0, -12.3));
        this.flatRocks74.setPaint(Color.WHITE);
        this.flatRocks74.setOpacity(1.0);
        this.flatRocks74.setName("flatRocks74");
        this.flatRocks74.setVehicle(this);
        this.flatRocks74.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks74.setPositionRelativeToVehicle(new Position(1.76, 0.0, -13.9));
        this.flatRocks75.setPaint(Color.WHITE);
        this.flatRocks75.setOpacity(1.0);
        this.flatRocks75.setName("flatRocks75");
        this.flatRocks75.setVehicle(this);
        this.flatRocks75.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks75.setPositionRelativeToVehicle(new Position(5.13, 0.0, -12.5));
        this.flatRocks76.setPaint(Color.WHITE);
        this.flatRocks76.setOpacity(1.0);
        this.flatRocks76.setName("flatRocks76");
        this.flatRocks76.setVehicle(this);
        this.flatRocks76.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks76.setPositionRelativeToVehicle(new Position(-0.995, 0.0, -14.2));
        this.flatRocks77.setPaint(Color.WHITE);
        this.flatRocks77.setOpacity(1.0);
        this.flatRocks77.setName("flatRocks77");
        this.flatRocks77.setVehicle(this);
        this.flatRocks77.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks77.setPositionRelativeToVehicle(new Position(8.44, 0.0, -5.08));
        this.flatRocks78.setPaint(Color.WHITE);
        this.flatRocks78.setOpacity(1.0);
        this.flatRocks78.setName("flatRocks78");
        this.flatRocks78.setVehicle(this);
        this.flatRocks78.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks78.setPositionRelativeToVehicle(new Position(8.65, 0.0, -6.86));
        this.flatRocks79.setPaint(Color.WHITE);
        this.flatRocks79.setOpacity(1.0);
        this.flatRocks79.setName("flatRocks79");
        this.flatRocks79.setVehicle(this);
        this.flatRocks79.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks79.setPositionRelativeToVehicle(new Position(8.95, 0.0, -8.51));
        this.flatRocks80.setPaint(Color.WHITE);
        this.flatRocks80.setOpacity(1.0);
        this.flatRocks80.setName("flatRocks80");
        this.flatRocks80.setVehicle(this);
        this.flatRocks80.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks80.setPositionRelativeToVehicle(new Position(7.82, 0.0, -10.5));
        this.flatRocks81.setPaint(Color.WHITE);
        this.flatRocks81.setOpacity(1.0);
        this.flatRocks81.setName("flatRocks81");
        this.flatRocks81.setVehicle(this);
        this.flatRocks81.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks81.setPositionRelativeToVehicle(new Position(-3.73, 0.0, -13.1));
        this.flatRocks82.setPaint(Color.WHITE);
        this.flatRocks82.setOpacity(1.0);
        this.flatRocks82.setName("flatRocks82");
        this.flatRocks82.setVehicle(this);
        this.flatRocks82.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks82.setPositionRelativeToVehicle(new Position(-3.67, 0.0, -11.9));
        this.flatRocks83.setPaint(Color.WHITE);
        this.flatRocks83.setOpacity(1.0);
        this.flatRocks83.setName("flatRocks83");
        this.flatRocks83.setVehicle(this);
        this.flatRocks83.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks83.setPositionRelativeToVehicle(new Position(-3.23, 0.0, -14.3));
        this.flatRocks84.setPaint(Color.WHITE);
        this.flatRocks84.setOpacity(1.0);
        this.flatRocks84.setName("flatRocks84");
        this.flatRocks84.setVehicle(this);
        this.flatRocks84.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks84.setPositionRelativeToVehicle(new Position(3.61, 0.0, -14.1));
        this.flatRocks85.setPaint(Color.WHITE);
        this.flatRocks85.setOpacity(1.0);
        this.flatRocks85.setName("flatRocks85");
        this.flatRocks85.setVehicle(this);
        this.flatRocks85.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0417179, 0.0, 0.999129));
        this.flatRocks85.setPositionRelativeToVehicle(new Position(5.85, 0.0, -13.4));
        this.flatRocks86.setPaint(Color.WHITE);
        this.flatRocks86.setOpacity(1.0);
        this.flatRocks86.setName("flatRocks86");
        this.flatRocks86.setVehicle(this);
        this.flatRocks86.setOrientationRelativeToVehicle(new Orientation(0.0, -0.0144795, 0.0, 0.999895));
        this.flatRocks86.setPositionRelativeToVehicle(new Position(4.85, 0.0, 0.956));
        this.fishingBoat.setPaint(Color.WHITE);
        this.fishingBoat.setOpacity(1.0);
        this.fishingBoat.setName("fishingBoat");
        this.fishingBoat.setVehicle(this);
        this.fishingBoat.setOrientationRelativeToVehicle(new Orientation(0.0, -0.0144795, 0.0, 0.999895));
        this.fishingBoat.setPositionRelativeToVehicle(new Position(0.963, 0.0, 4.81));
        this.riverRock.setPaint(Color.WHITE);
        this.riverRock.setOpacity(1.0);
        this.riverRock.setName("riverRock");
        this.riverRock.setVehicle(this);
        this.riverRock.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.riverRock.setPositionRelativeToVehicle(new Position(-5.43, 0.0, 28.5));
        this.riverRock2.setPaint(Color.WHITE);
        this.riverRock2.setOpacity(1.0);
        this.riverRock2.setName("riverRock2");
        this.riverRock2.setVehicle(this);
        this.riverRock2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.riverRock2.setPositionRelativeToVehicle(new Position(28.6, 0.0, 53.8));
        this.riverRock3.setPaint(Color.WHITE);
        this.riverRock3.setOpacity(1.0);
        this.riverRock3.setName("riverRock3");
        this.riverRock3.setVehicle(this);
        this.riverRock3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.riverRock3.setPositionRelativeToVehicle(new Position(13.3, 0.0, 14.1));
        this.riverRock4.setPaint(Color.WHITE);
        this.riverRock4.setOpacity(1.0);
        this.riverRock4.setName("riverRock4");
        this.riverRock4.setVehicle(this);
        this.riverRock4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.riverRock4.setPositionRelativeToVehicle(new Position(9.31, 0.0, 49.5));
        this.riverRock5.setPaint(Color.WHITE);
        this.riverRock5.setOpacity(1.0);
        this.riverRock5.setName("riverRock5");
        this.riverRock5.setVehicle(this);
        this.riverRock5.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.riverRock5.setPositionRelativeToVehicle(new Position(0.424, 0.0, 31.6));
        this.riverRock6.setPaint(Color.WHITE);
        this.riverRock6.setOpacity(1.0);
        this.riverRock6.setName("riverRock6");
        this.riverRock6.setVehicle(this);
        this.riverRock6.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.riverRock6.setPositionRelativeToVehicle(new Position(-10.0, 0.0, 80.8));
        this.rockyOutcrop.setPaint(Color.WHITE);
        this.rockyOutcrop.setOpacity(1.0);
        this.rockyOutcrop.setName("rockyOutcrop");
        this.rockyOutcrop.setVehicle(this);
        this.rockyOutcrop.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.rockyOutcrop.setPositionRelativeToVehicle(new Position(-6.85, 0.0, 45.7));
        this.rockyOutcrop2.setPaint(Color.WHITE);
        this.rockyOutcrop2.setOpacity(1.0);
        this.rockyOutcrop2.setName("rockyOutcrop2");
        this.rockyOutcrop2.setVehicle(this);
        this.rockyOutcrop2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.rockyOutcrop2.setPositionRelativeToVehicle(new Position(19.9, 0.0, 21.5));
        this.rockyOutcrop3.setPaint(Color.WHITE);
        this.rockyOutcrop3.setOpacity(1.0);
        this.rockyOutcrop3.setName("rockyOutcrop3");
        this.rockyOutcrop3.setVehicle(this);
        this.rockyOutcrop3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.rockyOutcrop3.setPositionRelativeToVehicle(new Position(-28.4, 0.0, 40.4));
        this.rockyOutcrop4.setPaint(Color.WHITE);
        this.rockyOutcrop4.setOpacity(1.0);
        this.rockyOutcrop4.setName("rockyOutcrop4");
        this.rockyOutcrop4.setVehicle(this);
        this.rockyOutcrop4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.06213, 0.0, 0.998068));
        this.rockyOutcrop4.setPositionRelativeToVehicle(new Position(-34.7, 0.0, 57.7));
        this.skull.setPaint(Color.WHITE);
        this.skull.setOpacity(1.0);
        this.skull.setName("skull");
        this.skull.setVehicle(this);
        this.skull.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0851567, 0.0, 0.996368));
        this.skull.setPositionRelativeToVehicle(new Position(42.5, 0.0, 46.3));
        this.skull2.setPaint(Color.WHITE);
        this.skull2.setOpacity(1.0);
        this.skull2.setName("skull2");
        this.skull2.setVehicle(this);
        this.skull2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0851567, 0.0, 0.996368));
        this.skull2.setPositionRelativeToVehicle(new Position(-15.3, 0.0, 46.7));
        this.skull3.setPaint(Color.WHITE);
        this.skull3.setOpacity(1.0);
        this.skull3.setName("skull3");
        this.skull3.setVehicle(this);
        this.skull3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0851567, 0.0, 0.996368));
        this.skull3.setPositionRelativeToVehicle(new Position(17.5, 0.0, 9.13));
        this.skull4.setPaint(Color.WHITE);
        this.skull4.setOpacity(1.0);
        this.skull4.setName("skull4");
        this.skull4.setVehicle(this);
        this.skull4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0851567, 0.0, 0.996368));
        this.skull4.setPositionRelativeToVehicle(new Position(-10.1, 0.0, 78.8));
        this.adultPerson.setPaint(Color.WHITE);
        this.adultPerson.setOpacity(1.0);
        this.adultPerson.setName("adultPerson");
        this.adultPerson.setVehicle(this);
        this.adultPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.adultPerson.setPositionRelativeToVehicle(new Position(18.7, -1.0, 27.8));
        this.flatRocks87.setPaint(Color.WHITE);
        this.flatRocks87.setOpacity(1.0);
        this.flatRocks87.setName("flatRocks87");
        this.flatRocks87.setVehicle(this);
        this.flatRocks87.setOrientationRelativeToVehicle(new Orientation(0.0286919, 0.685542, 0.0158352, 0.727295));
        this.flatRocks87.setPositionRelativeToVehicle(new Position(-32.9, 3.57E-32, 80.5));
        this.flatRocks87.setScale(new Scale(12.3, 12.3, 12.3));
        this.flatRocks88.setPaint(Color.WHITE);
        this.flatRocks88.setOpacity(1.0);
        this.flatRocks88.setName("flatRocks88");
        this.flatRocks88.setVehicle(this);
        this.flatRocks88.setOrientationRelativeToVehicle(new Orientation(0.0222342, 0.861842, -0.0266995, 0.505985));
        this.flatRocks88.setPositionRelativeToVehicle(new Position(51.2, 4.21E-33, 38.8));
        this.flatRocks88.setScale(new Scale(12.3, 12.3, 12.3));
        this.flatRocks89.setPaint(Color.WHITE);
        this.flatRocks89.setOpacity(1.0);
        this.flatRocks89.setName("flatRocks89");
        this.flatRocks89.setVehicle(this);
        this.flatRocks89.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0851567, 0.0, 0.996368));
        this.flatRocks89.setPositionRelativeToVehicle(new Position(66.6, 0.0, 71.4));
        this.flatRocks89.setScale(new Scale(6.64, 6.64, 6.64));
        this.rockyOutcrop5.setPaint(Color.WHITE);
        this.rockyOutcrop5.setOpacity(1.0);
        this.rockyOutcrop5.setName("rockyOutcrop5");
        this.rockyOutcrop5.setVehicle(this);
        this.rockyOutcrop5.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632577, 0.0, 0.997997));
        this.rockyOutcrop5.setPositionRelativeToVehicle(new Position(64.4, 0.0, 121.0));
        this.riverRock7.setPaint(Color.WHITE);
        this.riverRock7.setOpacity(1.0);
        this.riverRock7.setName("riverRock7");
        this.riverRock7.setVehicle(this);
        this.riverRock7.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632577, 0.0, 0.997997));
        this.riverRock7.setPositionRelativeToVehicle(new Position(27.8, 0.0, 69.9));
        this.adultPerson2.setPaint(Color.WHITE);
        this.adultPerson2.setOpacity(1.0);
        this.adultPerson2.setName("adultPerson2");
        this.adultPerson2.setVehicle(this);
        this.adultPerson2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.adultPerson2.setPositionRelativeToVehicle(new Position(-1.39, -1.0, 46.4));
        this.elderPerson.setPaint(Color.WHITE);
        this.elderPerson.setOpacity(1.0);
        this.elderPerson.setName("elderPerson");
        this.elderPerson.setVehicle(this);
        this.elderPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632577, 0.0, 0.997997));
        this.elderPerson.setPositionRelativeToVehicle(new Position(4.98, 0.25, -12.5));
        this.flatRocks90.setPaint(Color.WHITE);
        this.flatRocks90.setOpacity(1.0);
        this.flatRocks90.setName("flatRocks90");
        this.flatRocks90.setVehicle(this);
        this.flatRocks90.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks90.setPositionRelativeToVehicle(new Position(2.3, 0.0, -14.3));
        this.flatRocks91.setPaint(Color.WHITE);
        this.flatRocks91.setOpacity(1.0);
        this.flatRocks91.setName("flatRocks91");
        this.flatRocks91.setVehicle(this);
        this.flatRocks91.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks91.setPositionRelativeToVehicle(new Position(-0.591, 0.0, -15.4));
        this.flatRocks92.setPaint(Color.WHITE);
        this.flatRocks92.setOpacity(1.0);
        this.flatRocks92.setName("flatRocks92");
        this.flatRocks92.setVehicle(this);
        this.flatRocks92.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks92.setPositionRelativeToVehicle(new Position(-0.146, 0.0, -14.0));
        this.flatRocks93.setPaint(Color.WHITE);
        this.flatRocks93.setOpacity(1.0);
        this.flatRocks93.setName("flatRocks93");
        this.flatRocks93.setVehicle(this);
        this.flatRocks93.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks93.setPositionRelativeToVehicle(new Position(0.43, 0.0, -10.7));
        this.flatRocks94.setPaint(Color.WHITE);
        this.flatRocks94.setOpacity(1.0);
        this.flatRocks94.setName("flatRocks94");
        this.flatRocks94.setVehicle(this);
        this.flatRocks94.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks94.setPositionRelativeToVehicle(new Position(1.4, 0.0, -15.8));
        this.flatRocks95.setPaint(Color.WHITE);
        this.flatRocks95.setOpacity(1.0);
        this.flatRocks95.setName("flatRocks95");
        this.flatRocks95.setVehicle(this);
        this.flatRocks95.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks95.setPositionRelativeToVehicle(new Position(2.46, 0.0, -14.5));
        this.flatRocks96.setPaint(Color.WHITE);
        this.flatRocks96.setOpacity(1.0);
        this.flatRocks96.setName("flatRocks96");
        this.flatRocks96.setVehicle(this);
        this.flatRocks96.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks96.setPositionRelativeToVehicle(new Position(4.36, 0.0, -14.7));
        this.flatRocks97.setPaint(Color.WHITE);
        this.flatRocks97.setOpacity(1.0);
        this.flatRocks97.setName("flatRocks97");
        this.flatRocks97.setVehicle(this);
        this.flatRocks97.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks97.setPositionRelativeToVehicle(new Position(2.29, 0.0, -15.2));
        this.flatRocks98.setPaint(Color.WHITE);
        this.flatRocks98.setOpacity(1.0);
        this.flatRocks98.setName("flatRocks98");
        this.flatRocks98.setVehicle(this);
        this.flatRocks98.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks98.setPositionRelativeToVehicle(new Position(5.18, 0.0, -14.8));
        this.flatRocks99.setPaint(Color.WHITE);
        this.flatRocks99.setOpacity(1.0);
        this.flatRocks99.setName("flatRocks99");
        this.flatRocks99.setVehicle(this);
        this.flatRocks99.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks99.setPositionRelativeToVehicle(new Position(8.02, 0.0, -12.1));
        this.flatRocks100.setPaint(Color.WHITE);
        this.flatRocks100.setOpacity(1.0);
        this.flatRocks100.setName("flatRocks100");
        this.flatRocks100.setVehicle(this);
        this.flatRocks100.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks100.setPositionRelativeToVehicle(new Position(8.41, 0.0, -12.8));
        this.flatRocks101.setPaint(Color.WHITE);
        this.flatRocks101.setOpacity(1.0);
        this.flatRocks101.setName("flatRocks101");
        this.flatRocks101.setVehicle(this);
        this.flatRocks101.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks101.setPositionRelativeToVehicle(new Position(-3.23, 0.0, -14.5));
        this.flatRocks102.setPaint(Color.WHITE);
        this.flatRocks102.setOpacity(1.0);
        this.flatRocks102.setName("flatRocks102");
        this.flatRocks102.setVehicle(this);
        this.flatRocks102.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks102.setPositionRelativeToVehicle(new Position(-2.53, 0.0, -15.1));
        this.flatRocks103.setPaint(Color.WHITE);
        this.flatRocks103.setOpacity(1.0);
        this.flatRocks103.setName("flatRocks103");
        this.flatRocks103.setVehicle(this);
        this.flatRocks103.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks103.setPositionRelativeToVehicle(new Position(-0.556, 0.0, -15.7));
        this.flatRocks104.setPaint(Color.WHITE);
        this.flatRocks104.setOpacity(1.0);
        this.flatRocks104.setName("flatRocks104");
        this.flatRocks104.setVehicle(this);
        this.flatRocks104.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks104.setPositionRelativeToVehicle(new Position(2.51, 0.0, -15.9));
        this.flatRocks105.setPaint(Color.WHITE);
        this.flatRocks105.setOpacity(1.0);
        this.flatRocks105.setName("flatRocks105");
        this.flatRocks105.setVehicle(this);
        this.flatRocks105.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.flatRocks105.setPositionRelativeToVehicle(new Position(3.02, 0.0, -13.9));
        this.waterTankWall.setPaint(Color.WHITE);
        this.waterTankWall.setOpacity(1.0);
        this.waterTankWall.setName("waterTankWall");
        this.waterTankWall.setVehicle(this);
        this.waterTankWall.setOrientationRelativeToVehicle(new Orientation(0.0, 0.75302, 0.0, 0.657998));
        this.waterTankWall.setPositionRelativeToVehicle(new Position(0.979, 0.0, -14.5));
        this.waterTankWall.setScale(new Scale(1.46, 1.46, 1.46));
        this.waterTankTower.setPaint(Color.WHITE);
        this.waterTankTower.setOpacity(1.0);
        this.waterTankTower.setName("waterTankTower");
        this.waterTankTower.setVehicle(this);
        this.waterTankTower.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.waterTankTower.setPositionRelativeToVehicle(new Position(-4.86, 0.0, -14.8));
        this.waterTankTower2.setPaint(Color.WHITE);
        this.waterTankTower2.setOpacity(1.0);
        this.waterTankTower2.setName("waterTankTower2");
        this.waterTankTower2.setVehicle(this);
        this.waterTankTower2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.waterTankTower2.setPositionRelativeToVehicle(new Position(7.7, 0.0, -16.3));
        this.waterTankTower3.setPaint(Color.WHITE);
        this.waterTankTower3.setOpacity(1.0);
        this.waterTankTower3.setName("waterTankTower3");
        this.waterTankTower3.setVehicle(this);
        this.waterTankTower3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0632535, 0.0, 0.997997));
        this.waterTankTower3.setPositionRelativeToVehicle(new Position(1.86, 5.5, -12.1));
        this.waterTankTower3.setScale(new Scale(1.47, 1.47, 1.47));
        this.waterTankWell.setPaint(Color.WHITE);
        this.waterTankWell.setOpacity(1.0);
        this.waterTankWell.setName("waterTankWell");
        this.waterTankWell.setVehicle(this);
        this.waterTankWell.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0525116, 0.0, 0.99862));
        this.waterTankWell.setPositionRelativeToVehicle(new Position(-0.608, -1.5, -32.5));
        this.waterTankTower4.setPaint(Color.WHITE);
        this.waterTankTower4.setOpacity(1.0);
        this.waterTankTower4.setName("waterTankTower4");
        this.waterTankTower4.setVehicle(this);
        this.waterTankTower4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.077498, 0.0, 0.996993));
        this.waterTankTower4.setPositionRelativeToVehicle(new Position(13.7, 0.0, -16.5));
        this.waterTankTower5.setPaint(Color.WHITE);
        this.waterTankTower5.setOpacity(1.0);
        this.waterTankTower5.setName("waterTankTower5");
        this.waterTankTower5.setVehicle(this);
        this.waterTankTower5.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0234137, 0.0, 0.999726));
        this.waterTankTower5.setPositionRelativeToVehicle(new Position(-10.2, 0.0, -14.8));
        this.dante.setPaint(Color.WHITE);
        this.dante.setOpacity(1.0);
        this.dante.setName("dante");
        this.dante.setVehicle(this);
        this.dante.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.dante.setPositionRelativeToVehicle(new Position(1.84, 1.0, -22.2));
        this.qwdadscsfdgdfgh.setPaint(Color.WHITE);
        this.qwdadscsfdgdfgh.setOpacity(1.0);
        this.qwdadscsfdgdfgh.setName("qwdadscsfdgdfgh");
        this.qwdadscsfdgdfgh.setVehicle(this);
        this.qwdadscsfdgdfgh.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0499792, 0.0, 0.99875));
        this.qwdadscsfdgdfgh.setPositionRelativeToVehicle(new Position(1.15, 1.0, -22.0));
        this.sinner.setPaint(Color.WHITE);
        this.sinner.setOpacity(1.0);
        this.sinner.setName("sinner");
        this.sinner.setVehicle(this);
        this.sinner.setOrientationRelativeToVehicle(new Orientation(0.0, 0.285637, 0.0, 0.958338));
        this.sinner.setPositionRelativeToVehicle(new Position(6.24, 0.0, -4.16));
        this.alien.setPaint(Color.WHITE);
        this.alien.setOpacity(0.0);
        this.alien.setName("alien");
        this.alien.setVehicle(this);
        this.alien.setOrientationRelativeToVehicle(new Orientation(0.0, 0.21837, 0.0, 0.975866));
        this.alien.setPositionRelativeToVehicle(new Position(5.46, 0.0, -6.8));
        this.alien2.setPaint(Color.WHITE);
        this.alien2.setOpacity(0.0);
        this.alien2.setName("alien2");
        this.alien2.setVehicle(this);
        this.alien2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.21837, 0.0, 0.975866));
        this.alien2.setPositionRelativeToVehicle(new Position(4.41, 0.0, -5.37));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Procedures and functions to handle multiple scenes */">
    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public FlatRocks getFlatRocks() {
        return this.flatRocks;
    }

    public FlatRocks getFlatRocks2() {
        return this.flatRocks2;
    }

    public FlatRocks getFlatRocks3() {
        return this.flatRocks3;
    }

    public FlatRocks getFlatRocks4() {
        return this.flatRocks4;
    }

    public FlatRocks getFlatRocks5() {
        return this.flatRocks5;
    }

    public FlatRocks getFlatRocks6() {
        return this.flatRocks6;
    }

    public FlatRocks getFlatRocks7() {
        return this.flatRocks7;
    }

    public FlatRocks getFlatRocks8() {
        return this.flatRocks8;
    }

    public FlatRocks getFlatRocks9() {
        return this.flatRocks9;
    }

    public FlatRocks getFlatRocks10() {
        return this.flatRocks10;
    }

    public FlatRocks getFlatRocks11() {
        return this.flatRocks11;
    }

    public FlatRocks getFlatRocks12() {
        return this.flatRocks12;
    }

    public FlatRocks getFlatRocks13() {
        return this.flatRocks13;
    }

    public FlatRocks getFlatRocks14() {
        return this.flatRocks14;
    }

    public FlatRocks getFlatRocks15() {
        return this.flatRocks15;
    }

    public FlatRocks getFlatRocks16() {
        return this.flatRocks16;
    }

    public FlatRocks getFlatRocks17() {
        return this.flatRocks17;
    }

    public FlatRocks getFlatRocks18() {
        return this.flatRocks18;
    }

    public FlatRocks getFlatRocks19() {
        return this.flatRocks19;
    }

    public FlatRocks getFlatRocks20() {
        return this.flatRocks20;
    }

    public FlatRocks getFlatRocks21() {
        return this.flatRocks21;
    }

    public FlatRocks getFlatRocks22() {
        return this.flatRocks22;
    }

    public FlatRocks getFlatRocks23() {
        return this.flatRocks23;
    }

    public FlatRocks getFlatRocks24() {
        return this.flatRocks24;
    }

    public FlatRocks getFlatRocks25() {
        return this.flatRocks25;
    }

    public FlatRocks getFlatRocks26() {
        return this.flatRocks26;
    }

    public FlatRocks getFlatRocks27() {
        return this.flatRocks27;
    }

    public FlatRocks getFlatRocks28() {
        return this.flatRocks28;
    }

    public FlatRocks getFlatRocks29() {
        return this.flatRocks29;
    }

    public FlatRocks getFlatRocks30() {
        return this.flatRocks30;
    }

    public FlatRocks getFlatRocks31() {
        return this.flatRocks31;
    }

    public FlatRocks getFlatRocks32() {
        return this.flatRocks32;
    }

    public FlatRocks getFlatRocks33() {
        return this.flatRocks33;
    }

    public FlatRocks getFlatRocks34() {
        return this.flatRocks34;
    }

    public FlatRocks getFlatRocks35() {
        return this.flatRocks35;
    }

    public FlatRocks getFlatRocks36() {
        return this.flatRocks36;
    }

    public FlatRocks getFlatRocks37() {
        return this.flatRocks37;
    }

    public FlatRocks getFlatRocks38() {
        return this.flatRocks38;
    }

    public FlatRocks getFlatRocks39() {
        return this.flatRocks39;
    }

    public FlatRocks getFlatRocks40() {
        return this.flatRocks40;
    }

    public FlatRocks getFlatRocks41() {
        return this.flatRocks41;
    }

    public FlatRocks getFlatRocks42() {
        return this.flatRocks42;
    }

    public FlatRocks getFlatRocks43() {
        return this.flatRocks43;
    }

    public FlatRocks getFlatRocks44() {
        return this.flatRocks44;
    }

    public FlatRocks getFlatRocks45() {
        return this.flatRocks45;
    }

    public FlatRocks getFlatRocks46() {
        return this.flatRocks46;
    }

    public FlatRocks getFlatRocks47() {
        return this.flatRocks47;
    }

    public FlatRocks getFlatRocks48() {
        return this.flatRocks48;
    }

    public FlatRocks getFlatRocks49() {
        return this.flatRocks49;
    }

    public FlatRocks getFlatRocks50() {
        return this.flatRocks50;
    }

    public FlatRocks getFlatRocks51() {
        return this.flatRocks51;
    }

    public FlatRocks getFlatRocks52() {
        return this.flatRocks52;
    }

    public FlatRocks getFlatRocks53() {
        return this.flatRocks53;
    }

    public FlatRocks getFlatRocks54() {
        return this.flatRocks54;
    }

    public FlatRocks getFlatRocks55() {
        return this.flatRocks55;
    }

    public FlatRocks getFlatRocks56() {
        return this.flatRocks56;
    }

    public FlatRocks getFlatRocks57() {
        return this.flatRocks57;
    }

    public FlatRocks getFlatRocks58() {
        return this.flatRocks58;
    }

    public FlatRocks getFlatRocks59() {
        return this.flatRocks59;
    }

    public FlatRocks getFlatRocks60() {
        return this.flatRocks60;
    }

    public FlatRocks getFlatRocks61() {
        return this.flatRocks61;
    }

    public FlatRocks getFlatRocks62() {
        return this.flatRocks62;
    }

    public FlatRocks getFlatRocks63() {
        return this.flatRocks63;
    }

    public FlatRocks getFlatRocks64() {
        return this.flatRocks64;
    }

    public FlatRocks getFlatRocks65() {
        return this.flatRocks65;
    }

    public Docks getDocks() {
        return this.docks;
    }

    public FlatRocks getFlatRocks66() {
        return this.flatRocks66;
    }

    public FlatRocks getFlatRocks67() {
        return this.flatRocks67;
    }

    public FlatRocks getFlatRocks68() {
        return this.flatRocks68;
    }

    public FlatRocks getFlatRocks69() {
        return this.flatRocks69;
    }

    public FlatRocks getFlatRocks70() {
        return this.flatRocks70;
    }

    public FlatRocks getFlatRocks71() {
        return this.flatRocks71;
    }

    public FlatRocks getFlatRocks72() {
        return this.flatRocks72;
    }

    public FlatRocks getFlatRocks73() {
        return this.flatRocks73;
    }

    public FlatRocks getFlatRocks74() {
        return this.flatRocks74;
    }

    public FlatRocks getFlatRocks75() {
        return this.flatRocks75;
    }

    public FlatRocks getFlatRocks76() {
        return this.flatRocks76;
    }

    public FlatRocks getFlatRocks77() {
        return this.flatRocks77;
    }

    public FlatRocks getFlatRocks78() {
        return this.flatRocks78;
    }

    public FlatRocks getFlatRocks79() {
        return this.flatRocks79;
    }

    public FlatRocks getFlatRocks80() {
        return this.flatRocks80;
    }

    public FlatRocks getFlatRocks81() {
        return this.flatRocks81;
    }

    public FlatRocks getFlatRocks82() {
        return this.flatRocks82;
    }

    public FlatRocks getFlatRocks83() {
        return this.flatRocks83;
    }

    public FlatRocks getFlatRocks84() {
        return this.flatRocks84;
    }

    public FlatRocks getFlatRocks85() {
        return this.flatRocks85;
    }

    public FlatRocks getFlatRocks86() {
        return this.flatRocks86;
    }

    public FishingBoat getFishingBoat() {
        return this.fishingBoat;
    }

    public RiverRock getRiverRock() {
        return this.riverRock;
    }

    public RiverRock getRiverRock2() {
        return this.riverRock2;
    }

    public RiverRock getRiverRock3() {
        return this.riverRock3;
    }

    public RiverRock getRiverRock4() {
        return this.riverRock4;
    }

    public RiverRock getRiverRock5() {
        return this.riverRock5;
    }

    public RiverRock getRiverRock6() {
        return this.riverRock6;
    }

    public RockyOutcrop getRockyOutcrop() {
        return this.rockyOutcrop;
    }

    public RockyOutcrop getRockyOutcrop2() {
        return this.rockyOutcrop2;
    }

    public RockyOutcrop getRockyOutcrop3() {
        return this.rockyOutcrop3;
    }

    public RockyOutcrop getRockyOutcrop4() {
        return this.rockyOutcrop4;
    }

    public Skull getSkull() {
        return this.skull;
    }

    public Skull getSkull2() {
        return this.skull2;
    }

    public Skull getSkull3() {
        return this.skull3;
    }

    public Skull getSkull4() {
        return this.skull4;
    }

    public AdultPerson getAdultPerson() {
        return this.adultPerson;
    }

    public FlatRocks getFlatRocks87() {
        return this.flatRocks87;
    }

    public FlatRocks getFlatRocks88() {
        return this.flatRocks88;
    }

    public FlatRocks getFlatRocks89() {
        return this.flatRocks89;
    }

    public RockyOutcrop getRockyOutcrop5() {
        return this.rockyOutcrop5;
    }

    public RiverRock getRiverRock7() {
        return this.riverRock7;
    }

    public AdultPerson getAdultPerson2() {
        return this.adultPerson2;
    }

    public ElderPerson getElderPerson() {
        return this.elderPerson;
    }

    public FlatRocks getFlatRocks90() {
        return this.flatRocks90;
    }

    public FlatRocks getFlatRocks91() {
        return this.flatRocks91;
    }

    public FlatRocks getFlatRocks92() {
        return this.flatRocks92;
    }

    public FlatRocks getFlatRocks93() {
        return this.flatRocks93;
    }

    public FlatRocks getFlatRocks94() {
        return this.flatRocks94;
    }

    public FlatRocks getFlatRocks95() {
        return this.flatRocks95;
    }

    public FlatRocks getFlatRocks96() {
        return this.flatRocks96;
    }

    public FlatRocks getFlatRocks97() {
        return this.flatRocks97;
    }

    public FlatRocks getFlatRocks98() {
        return this.flatRocks98;
    }

    public FlatRocks getFlatRocks99() {
        return this.flatRocks99;
    }

    public FlatRocks getFlatRocks100() {
        return this.flatRocks100;
    }

    public FlatRocks getFlatRocks101() {
        return this.flatRocks101;
    }

    public FlatRocks getFlatRocks102() {
        return this.flatRocks102;
    }

    public FlatRocks getFlatRocks103() {
        return this.flatRocks103;
    }

    public FlatRocks getFlatRocks104() {
        return this.flatRocks104;
    }

    public FlatRocks getFlatRocks105() {
        return this.flatRocks105;
    }

    public WaterTankWall getWaterTankWall() {
        return this.waterTankWall;
    }

    public WaterTankTower getWaterTankTower() {
        return this.waterTankTower;
    }

    public WaterTankTower getWaterTankTower2() {
        return this.waterTankTower2;
    }

    public WaterTankTower getWaterTankTower3() {
        return this.waterTankTower3;
    }

    public WaterTankWell getWaterTankWell() {
        return this.waterTankWell;
    }

    public WaterTankTower getWaterTankTower4() {
        return this.waterTankTower4;
    }

    public WaterTankTower getWaterTankTower5() {
        return this.waterTankTower5;
    }

    public ElderPerson getDante() {
        return this.dante;
    }

    public AdultPerson getQwdadscsfdgdfgh() {
        return this.qwdadscsfdgdfgh;
    }

    public ElderPerson getSinner() {
        return this.sinner;
    }

    public Alien getAlien() {
        return this.alien;
    }

    public Alien getAlien2() {
        return this.alien2;
    }
    // </editor-fold>

public void walking(Person person){
//start a Thread for each Runnable and wait until they complete

doTogether(()->{
    person.getRightShoulder().turn(TurnDirection.RIGHT,0.125);
},()->{
    person.getLeftShoulder().turn(TurnDirection.RIGHT,0.125);
},()->{
    person.getRightHip().turn(TurnDirection.BACKWARD,0.08);
},()->{
    person.getLeftHip().turn(TurnDirection.FORWARD,0.08);
},()->{
    person.getRightKnee().turn(TurnDirection.FORWARD,0.08);
//},()->{
//    person.move(MoveDirection.FORWARD,.5);
});

doTogether(()->{
   // person.move(MoveDirection.FORWARD,.5);
},()->{
    person.straightenOutJoints();
});
    
doTogether(()->{
    person.getRightShoulder().turn(TurnDirection.LEFT,0.125);
},()->{
    person.getLeftShoulder().turn(TurnDirection.LEFT,0.125);
},()->{
    person.getRightHip().turn(TurnDirection.FORWARD,0.08);
},()->{
    person.getLeftHip().turn(TurnDirection.BACKWARD,0.08);
},()->{
    person.getRightKnee().turn(TurnDirection.FORWARD,0.08);
//},()->{
   // person.move(MoveDirection.FORWARD,.5);
});

doTogether(()->{
    person.move(MoveDirection.FORWARD,.5);
},()->{
    person.straightenOutJoints();
});

}
public void intro(){
    this.qwdadscsfdgdfgh.say("we have arrived at the river Styx");
     this.qwdadscsfdgdfgh.say("on the other side is the cirty of dis ");
     this.dante.say("cool");
}  
public void SinnerConverstion(){
         
        this.camera.move(MoveDirection.FORWARD, 22.0, Move.duration(2.0));
         this.dante.turnToFace(this.sinner, Move.duration(0));
         this.elderPerson.turnToFace(this.sinner, Move.duration(0));
         this.qwdadscsfdgdfgh.turnToFace(this.sinner, Move.duration(0));
         this.dante.moveToward(this.camera, 5.0,Move.duration(0));
         this.qwdadscsfdgdfgh.moveToward(this.camera, 5.0,Move.duration(0) );
         this.dante.move(MoveDirection.RIGHT, .5, Move.duration(0));
         this.qwdadscsfdgdfgh.move(MoveDirection.RIGHT, .5, Move.duration(0));
         
         
    doTogether(()->{
        this.dante.moveTo(this.alien2, MoveTo.duration(3.0));
    },()->{
        walking(dante);
    },()->{
        this.qwdadscsfdgdfgh.moveTo(this.alien, MoveTo.duration(5.0));
    },()->{
        walking(qwdadscsfdgdfgh);
    },()->{
        this.camera.turnToFace(this.dante);
    });

        this.dante.turnToFace(this.sinner, Move.duration(0));
        
        this.camera.turnToFace(this.sinner);
        
        
        this.dante.say("SINNER!!!");
        this.dante.say("i know you ");
        this.sinner.say("hey Dante");
        
        this.dante.moveToward(this.sinner, 1.0);
        this.dante.getRightShoulder().pointAt(this.sinner);
        
    doTogether(()->{
        this.dante.getLeftHip().pointAt(this.sinner);
    },()->{
         this.sinner.say("what are you doing");   
    });
        this.dante.say("i have no remorse for you");
        this.dante.getRightShoulder().pointAt(ground);
        this.sinner.say("ahahahh");
        this.sinner.move(MoveDirection.DOWN, 10, Move.duration(3));
        this.dante.straightenOutJoints();
        this.qwdadscsfdgdfgh.say("lets get in the boat");
}


}



//start a Thread for each Runnable and wait until they complete

















