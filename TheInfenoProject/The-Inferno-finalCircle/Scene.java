// <editor-fold defaultstate="collapsed" desc="imports">

import static org.lgna.common.ThreadUtilities.doTogether;
import org.lgna.story.*;
import org.lgna.story.resources.sims2.FemaleTeenFullBodyOutfitGothSpikeNeck;
import org.lgna.story.resources.sims2.AdultFullBodyOutfitAstronaut;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitPowerSuit;
import org.lgna.story.resources.sims2.MaleAdultHairShort;
import org.lgna.story.resources.sims2.FemaleTeenHairShortTuckin;
import org.lgna.story.resources.sims2.MaleAdultHairRound;
import org.lgna.story.resources.sims2.MaleAdultHairHatCowboyFlat;
import org.lgna.story.resources.prop.IceFloeResource;
import org.lgna.story.resources.sims2.AdultPersonResource;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitOverhangTshirtGamespot;
import org.lgna.story.resources.sims2.FemaleTeenHairHalo;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.MaleAdultHairHatCapUp;
import org.lgna.story.resources.sims2.MaleTeenFullBodyOutfitCop;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitDressShirtShortsSocksShoes;
import org.lgna.story.resources.sims2.MaleAdultHairMohawk;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitTrackSuit;
import org.lgna.story.resources.sims2.MaleChildFullBodyOutfitOpenCoatLongPants;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.sims2.MaleAdultHairHatBallcap;
import org.lgna.story.resources.sims2.MaleAdultHairWill;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitAmbulanceDriver;
import org.lgna.story.resources.sims2.ElderPersonResource;
import org.lgna.story.resources.sims2.ChildHairBald;
import org.lgna.story.resources.sims2.MaleAdultHairPompodore;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitOverhangTshirt;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitShorts;
import org.lgna.story.resources.sims2.MaleAdultHairGibs;
import org.lgna.story.resources.sims2.TeenPersonResource;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitHiphopHood;
import org.lgna.story.resources.prop.CaveResource;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitMayor;
import org.lgna.story.resources.sims2.MaleAdultHairHatKilt;
import org.lgna.story.resources.sims2.FemaleTeenFullBodyOutfitOrderly;
import org.lgna.story.resources.sims2.MaleTeenHairHatFedora;
import org.lgna.story.resources.biped.PixieResource;
import org.lgna.story.resources.sims2.MaleAdultHairShocked;
import org.lgna.story.resources.sims2.MaleAdultHairMessy;
import org.lgna.story.resources.sims2.MaleAdultHairHatBeret;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.prop.RiverRockResource;
import org.lgna.story.resources.sims2.MaleTeenFullBodyOutfitTightPantsLooseShirt;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.MaleAdultHairHatBucket;
import org.lgna.story.resources.sims2.ChildPersonResource;
// </editor-fold>
//*******************************************************************************
//finalCircle.java
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
        this.alien.move(MoveDirection.UP, 2.0, Move.duration(3));
        this.alien.move(MoveDirection.BACKWARD, 2.0, Move.duration(0));
        this.pixie.getHead().move(MoveDirection.DOWN, 10.0, Move.duration(0));
        this.dante.move(MoveDirection.LEFT, .5, Move.duration(0));
        
        dialog();
        
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Cave cave = new Cave(CaveResource.WIDE_MOSSY);
    private final IceFloe iceFloe = new IceFloe(IceFloeResource.ICE_FLOE1);
    private final Pixie pixie = new Pixie(PixieResource.PINK);
    private final Curupira curupira = new Curupira();
    private final Curupira curupira2 = new Curupira();
    private final Curupira curupira3 = new Curupira();
    private final ElderPerson elderPerson = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.LIGHT_BLUE, MaleAdultHairHatBallcap.GREY_BLACK_HAT, 0.011619, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_03));
    private final ElderPerson elderPerson2 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.4, 0.212, 0.051), BaseEyeColor.DARK_BROWN, MaleAdultHairHatKilt.GREY_RED_HAT, 0.339401, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_18));
    private final ElderPerson elderPerson3 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.DARK_BLUE, MaleAdultHairWill.GREY, 0.847464, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_05));
    private final ElderPerson elderPerson4 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.DARK_BLUE, MaleAdultHairHatBucket.BLACK_BLUE_HAT, 0.578938, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_23));
    private final ElderPerson elderPerson5 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.DARK_BLUE, MaleAdultHairMessy.GREY, 0.0297742, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_23));
    private final ElderPerson elderPerson6 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.4, 0.212, 0.051), BaseEyeColor.LIGHT_BLUE, MaleAdultHairHatKilt.GREY_BLUE_HAT, 0.785003, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_00));
    private final RiverRock riverRock = new RiverRock(RiverRockResource.LITTLE_ROCK);
    private final ElderPerson elderPerson7 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GRAY, MaleAdultHairHatCowboyFlat.GREY_GREY_HAT, 0.0727061, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_08));
    private final ElderPerson elderPerson8 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.DARK_BROWN, MaleAdultHairMohawk.GREY, 0.706909, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_08));
    private final TeenPerson teenPerson = new TeenPerson(new TeenPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GRAY, MaleTeenHairHatFedora.BROWN_BLACK_HAT, 0.61205, MaleTeenFullBodyOutfitTightPantsLooseShirt.BLOOD_GOTH, BaseFace.HUMAN_13));
    private final ElderPerson elderPerson9 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GREEN, MaleAdultHairShocked.BLACK, 0.584988, MaleElderFullBodyOutfitShorts.FRIED, BaseFace.HUMAN_11));
    private final AdultPerson adultPerson = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.DARK_BLUE, MaleAdultHairShort.RED, 0.882473, MaleAdultFullBodyOutfitTrackSuit.BLACK, BaseFace.HUMAN_09));
    private final TeenPerson teenPerson2 = new TeenPerson(new TeenPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.GRAY, MaleTeenHairHatFedora.BLOND_BLACK_HAT, 0.177426, MaleTeenFullBodyOutfitCop.POLICE, BaseFace.HUMAN_21));
    private final ElderPerson elderPerson10 = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.GRAY, MaleAdultHairGibs.GREY, 0.0995428, MaleElderFullBodyOutfitMayor.BLUE_TIE_MAYOR, BaseFace.HUMAN_15));
    private final AdultPerson adultPerson2 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.DARK_BLUE, MaleAdultHairGibs.BLACK, 0.717176, MaleAdultFullBodyOutfitOverhangTshirtGamespot.BLACK_LOGO, BaseFace.HUMAN_05));
    private final TeenPerson teenPerson3 = new TeenPerson(new TeenPersonResource(Gender.FEMALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.LIGHT_BLUE, FemaleTeenHairShortTuckin.RED, 0.620183, FemaleTeenFullBodyOutfitGothSpikeNeck.BLACK_VIOLET, BaseFace.HUMAN_17));
    private final TeenPerson teenPerson4 = new TeenPerson(new TeenPersonResource(Gender.FEMALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.LIGHT_BLUE, FemaleTeenHairHalo.BROWN, 0.297353, FemaleTeenFullBodyOutfitOrderly.AQUA, BaseFace.HUMAN_14));
    private final AdultPerson adultPerson3 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.LIGHT_BLUE, MaleAdultHairHatCapUp.GREY_HAT, 0.686877, MaleAdultFullBodyOutfitHiphopHood.GREEN, BaseFace.HUMAN_14));
    private final AdultPerson adultPerson4 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GREEN, MaleAdultHairHatBeret.BLACK_CAMO_HAT, 0.859082, MaleAdultFullBodyOutfitAmbulanceDriver.BLUE, BaseFace.HUMAN_03));
    private final ElderPerson dante = new ElderPerson(new ElderPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.DARK_BROWN, MaleAdultHairRound.GREY, 0.409228, MaleElderFullBodyOutfitDressShirtShortsSocksShoes.PURPLE_HAWAIIAN_TAN_SHORTS, BaseFace.ALIEN));
    private final AdultPerson adultPerson5 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.GREEN, MaleAdultHairShocked.BLACK, 0.527486, AdultFullBodyOutfitAstronaut.WHITE, BaseFace.HUMAN_03));
    private final Alien alien = new Alien();
    private final ChildPerson sinner1 = new ChildPerson(new ChildPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.GREEN, ChildHairBald.BARE, 0.588885, MaleChildFullBodyOutfitOpenCoatLongPants.PVT_SCHOOL, BaseFace.HUMAN_09));
    private final AdultPerson adultPerson6 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.808, 0.58, 0.451), BaseEyeColor.DARK_BLUE, MaleAdultHairPompodore.GREY, 0.190709, MaleAdultFullBodyOutfitOverhangTshirt.GREEN_LOGO, BaseFace.HUMAN_03));
    private final AdultPerson adultPerson7 = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.DARK_BLUE, MaleAdultHairPompodore.BLOND, 0.208399, MaleAdultFullBodyOutfitPowerSuit.STRIP, BaseFace.HUMAN_13));
    private final GopherHole gopherHole = new GopherHole();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup  */">
    private void performCustomSetup() {
//Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
//DO NOT EDIT
//This code is automatically generated.  Any work you perform in this method will be overwritten.
//DO NOT EDIT
        this.setAtmosphereColor(new Color(0.11, 0.133, 0.178));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(new Color(0.0, 0.118, 0.396));
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.MOON);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0196748, 0.675179, -0.0254678, 0.736951));
        this.camera.setPositionRelativeToVehicle(new Position(15.6, 0.545, 32.3));
        this.cave.setPaint(Color.WHITE);
        this.cave.setOpacity(1.0);
        this.cave.setName("cave");
        this.cave.setVehicle(this);
        this.cave.setOrientationRelativeToVehicle(new Orientation(0.0, -0.0374912, 0.0, 0.999297));
        this.cave.setPositionRelativeToVehicle(new Position(-4.95, 0.0, 31.3));
        this.cave.setScale(new Scale(1.1, 1.1, 1.1));
        this.iceFloe.setPaint(Color.WHITE);
        this.iceFloe.setOpacity(1.0);
        this.iceFloe.setName("iceFloe");
        this.iceFloe.setVehicle(this);
        this.iceFloe.setOrientationRelativeToVehicle(new Orientation(0.0, -0.00661033, 0.0, 0.999978));
        this.iceFloe.setPositionRelativeToVehicle(new Position(-8.35, -6.29, 38.3));
        this.iceFloe.setScale(new Scale(17.1, 17.1, 17.1));
        this.pixie.setPaint(Color.RED);
        this.pixie.setOpacity(1.0);
        this.pixie.setName("pixie");
        this.pixie.setVehicle(this);
        this.pixie.setOrientationRelativeToVehicle(new Orientation(0.0, -0.679224, 0.0, 0.733931));
        this.pixie.setPositionRelativeToVehicle(new Position(-3.62, -4.14, 30.2));
        this.pixie.setScale(new Scale(6.54, 6.54, 6.54));
        this.pixie.getPelvis().setPositionRelativeToVehicle(new Position(-1.38E-16, -0.00147, -1.76E-4));
        this.pixie.getSpineBase().setPositionRelativeToVehicle(new Position(-0.002, 0.0602, -1.39E-4));
        this.pixie.getSpineMiddle().setPositionRelativeToVehicle(new Position(-0.002, 0.0982, -0.619));
        this.pixie.getSpineUpper().setPositionRelativeToVehicle(new Position(2.91E-17, 4.07E-16, -0.461));
        this.pixie.getNeck().setPositionRelativeToVehicle(new Position(5.96E-14, -1.57E-14, -0.167));
        this.pixie.getHead().setOrientationRelativeToVehicle(new Orientation(-0.69876, -0.0231564, 0.0226424, 0.714623));
        this.pixie.getHead().setPositionRelativeToVehicle(new Position(9.24E-14, -0.0481, 1.84));
        this.pixie.getMouth().setPositionRelativeToVehicle(new Position(4.64E-4, -0.118, -0.164));
        this.pixie.getRightEye().setPositionRelativeToVehicle(new Position(0.211, 0.235, -0.404));
        this.pixie.getLeftEye().setPositionRelativeToVehicle(new Position(-0.211, 0.235, -0.404));
        this.pixie.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.211, 0.235, -0.404));
        this.pixie.getRightEyelid().setPositionRelativeToVehicle(new Position(0.211, 0.235, -0.404));
        this.pixie.getRightHip().setPositionRelativeToVehicle(new Position(0.34, 0.0911, -0.487));
        this.pixie.getRightKnee().setPositionRelativeToVehicle(new Position(-3.08E-15, -1.6E-16, -1.23));
        this.pixie.getRightAnkle().setPositionRelativeToVehicle(new Position(-9.3E-16, 2.32E-16, -2.14));
        this.pixie.getRightFoot().setPositionRelativeToVehicle(new Position(-0.0139, -0.00162, -0.407));
        this.pixie.getLeftHip().setPositionRelativeToVehicle(new Position(-0.346, 0.0911, -0.487));
        this.pixie.getLeftKnee().setPositionRelativeToVehicle(new Position(0.00136, 0.0259, -1.25));
        this.pixie.getLeftAnkle().setPositionRelativeToVehicle(new Position(-0.0571, 0.143, -2.1));
        this.pixie.getLeftFoot().setPositionRelativeToVehicle(new Position(0.00233, -2.57E-4, -0.409));
        this.pixie.getRightClavicle().setPositionRelativeToVehicle(new Position(0.19, -0.138, 0.144));
        this.pixie.getRightShoulder().setPositionRelativeToVehicle(new Position(4.65E-15, 0.164, 2.91E-16));
        this.pixie.getRightElbow().setPositionRelativeToVehicle(new Position(-1.49E-14, 0.715, 6.51E-15));
        this.pixie.getRightWrist().setPositionRelativeToVehicle(new Position(-2.1E-14, 5.58E-15, -0.605));
        this.pixie.getRightHand().setPositionRelativeToVehicle(new Position(-4.94E-15, 9.3E-16, -0.276));
        this.pixie.getRightIndexFinger().setPositionRelativeToVehicle(new Position(1.05E-14, 1.49E-14, -0.241));
        this.pixie.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(-5.53E-14, 5.49E-14, -0.203));
        this.pixie.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(0.415, 0.165, -0.25));
        this.pixie.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(2.32E-16, -9.3E-16, -0.299));
        this.pixie.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.518, -0.0178, 0.0306));
        this.pixie.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(-6.39E-16, 0.0, -0.337));
        this.pixie.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.2, -0.0706, 0.137));
        this.pixie.getLeftShoulder().setPositionRelativeToVehicle(new Position(-5.23E-16, -2.79E-15, -0.187));
        this.pixie.getLeftElbow().setPositionRelativeToVehicle(new Position(3.41E-16, 0.0, -0.715));
        this.pixie.getLeftWrist().setPositionRelativeToVehicle(new Position(-6.04E-13, -4.7E-13, -0.605));
        this.pixie.getLeftHand().setPositionRelativeToVehicle(new Position(-9.43E-14, 2.88E-14, -0.276));
        this.pixie.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(-3.46E-14, -1.3E-13, -0.241));
        this.pixie.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(9.53E-15, -7.53E-14, -0.203));
        this.pixie.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(-0.415, 0.165, -0.25));
        this.pixie.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(4.65E-16, 1.86E-15, -0.299));
        this.pixie.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.518, -0.0178, 0.0306));
        this.pixie.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(2.91E-15, 7.44E-15, -0.337));
        this.pixie.getRightBottomWing().setPositionRelativeToVehicle(new Position(0.134, 0.499, 0.0722));
        this.pixie.getLeftBottomWing().setPositionRelativeToVehicle(new Position(-0.232, 0.466, 0.0746));
        this.pixie.getRightTopWing().setPositionRelativeToVehicle(new Position(0.756, 1.1, -0.435));
        this.pixie.getLeftTopWing().setPositionRelativeToVehicle(new Position(-0.849, 0.91, -0.42));
        this.curupira.setPaint(Color.PINK);
        this.curupira.setOpacity(1.0);
        this.curupira.setName("curupira");
        this.curupira.setVehicle(this.pixie);
        this.curupira.setOrientationRelativeToVehicle(new Orientation(0.0122364, -0.465214, -0.00500368, 0.8851));
        this.curupira.setPositionRelativeToVehicle(new Position(0.227, 5.17, 0.202));
        this.curupira2.setPaint(Color.PINK);
        this.curupira2.setOpacity(1.0);
        this.curupira2.setName("curupira2");
        this.curupira2.setVehicle(this.pixie);
        this.curupira2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.0666058, 0.0, 0.997779));
        this.curupira2.setPositionRelativeToVehicle(new Position(0.0459, 5.18, -0.058));
        this.curupira3.setPaint(Color.PINK);
        this.curupira3.setOpacity(1.0);
        this.curupira3.setName("curupira3");
        this.curupira3.setVehicle(this.pixie);
        this.curupira3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.182318, 0.0, 0.98324));
        this.curupira3.setPositionRelativeToVehicle(new Position(-0.269, 5.13, 0.446));
        this.elderPerson.setPaint(Color.WHITE);
        this.elderPerson.setOpacity(1.0);
        this.elderPerson.setName("elderPerson");
        this.elderPerson.setVehicle(this);
        this.elderPerson.setOrientationRelativeToVehicle(new Orientation(0.0, -0.709143, 0.0, 0.705065));
        this.elderPerson.setPositionRelativeToVehicle(new Position(-2.49, -0.117, 32.4));
        this.elderPerson.setScale(new Scale(0.417, 0.417, 0.417));
        this.elderPerson.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0418));
        this.elderPerson.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0166, -0.0436));
        this.elderPerson.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0602));
        this.elderPerson.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0602));
        this.elderPerson.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0602));
        this.elderPerson.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0282));
        this.elderPerson.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00451, -0.0357));
        this.elderPerson.getRightEye().setPositionRelativeToVehicle(new Position(0.0132, 0.0312, -0.0346));
        this.elderPerson.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0133, 0.0313, -0.0346));
        this.elderPerson.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0133, 0.0313, -0.0346));
        this.elderPerson.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0132, 0.0312, -0.0346));
        this.elderPerson.getRightHip().setPositionRelativeToVehicle(new Position(0.0248, 0.0, -0.0414));
        this.elderPerson.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.188));
        this.elderPerson.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0572));
        this.elderPerson.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0248, 0.0, -0.0414));
        this.elderPerson.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.188));
        this.elderPerson.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0572));
        this.elderPerson.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00752, -0.0128, -0.0311));
        this.elderPerson.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0527));
        this.elderPerson.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0527));
        this.elderPerson.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0542));
        this.elderPerson.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0183, -0.00301, -0.0164));
        this.elderPerson.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0147));
        this.elderPerson.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.82E-17, -0.032));
        this.elderPerson.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.elderPerson.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00564, 0.0, -0.0323));
        this.elderPerson.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.032));
        this.elderPerson.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00752, -0.0128, -0.0311));
        this.elderPerson.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0527));
        this.elderPerson.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0527));
        this.elderPerson.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0542));
        this.elderPerson.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0183, -0.00301, -0.0164));
        this.elderPerson.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0147));
        this.elderPerson.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.032));
        this.elderPerson.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.elderPerson.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00564, 0.0, -0.0323));
        this.elderPerson.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.032));
        this.elderPerson.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson2.setPaint(Color.WHITE);
        this.elderPerson2.setOpacity(1.0);
        this.elderPerson2.setName("elderPerson2");
        this.elderPerson2.setVehicle(this);
        this.elderPerson2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.709143, 0.0, 0.705065));
        this.elderPerson2.setPositionRelativeToVehicle(new Position(-7.4, -0.124, 31.9));
        this.elderPerson2.setScale(new Scale(0.416, 0.416, 0.416));
        this.elderPerson2.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.elderPerson2.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0434));
        this.elderPerson2.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson2.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson2.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson2.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.elderPerson2.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00449, -0.0356));
        this.elderPerson2.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0344));
        this.elderPerson2.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.elderPerson2.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.elderPerson2.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0344));
        this.elderPerson2.getRightHip().setPositionRelativeToVehicle(new Position(0.0247, 0.0, -0.0412));
        this.elderPerson2.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson2.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson2.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.elderPerson2.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0247, 0.0, -0.0412));
        this.elderPerson2.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson2.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson2.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.elderPerson2.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00749, -0.0128, -0.0309));
        this.elderPerson2.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson2.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson2.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson2.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.elderPerson2.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0163));
        this.elderPerson2.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson2.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0318));
        this.elderPerson2.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson2.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00562, 0.0, -0.0322));
        this.elderPerson2.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson2.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0318));
        this.elderPerson2.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson2.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00749, -0.0128, -0.0309));
        this.elderPerson2.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson2.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson2.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson2.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.elderPerson2.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0163));
        this.elderPerson2.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson2.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0318));
        this.elderPerson2.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson2.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00562, 0.0, -0.0322));
        this.elderPerson2.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson2.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0318));
        this.elderPerson2.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson3.setPaint(Color.WHITE);
        this.elderPerson3.setOpacity(1.0);
        this.elderPerson3.setName("elderPerson3");
        this.elderPerson3.setVehicle(this);
        this.elderPerson3.setOrientationRelativeToVehicle(new Orientation(0.0, -0.709143, 0.0, 0.705065));
        this.elderPerson3.setPositionRelativeToVehicle(new Position(0.271, -0.0704, 34.0));
        this.elderPerson3.setScale(new Scale(0.416, 0.416, 0.416));
        this.elderPerson3.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.elderPerson3.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0434));
        this.elderPerson3.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson3.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson3.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson3.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.elderPerson3.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00449, -0.0356));
        this.elderPerson3.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson3.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.elderPerson3.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.elderPerson3.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson3.getRightHip().setPositionRelativeToVehicle(new Position(0.0247, 0.0, -0.0412));
        this.elderPerson3.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson3.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson3.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.elderPerson3.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0247, 0.0, -0.0412));
        this.elderPerson3.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson3.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson3.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.elderPerson3.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00749, -0.0128, -0.0309));
        this.elderPerson3.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson3.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson3.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson3.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.elderPerson3.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0163));
        this.elderPerson3.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson3.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0318));
        this.elderPerson3.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson3.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00562, 0.0, -0.0322));
        this.elderPerson3.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson3.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0318));
        this.elderPerson3.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson3.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00749, -0.0128, -0.0309));
        this.elderPerson3.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson3.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson3.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson3.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.elderPerson3.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0163));
        this.elderPerson3.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson3.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0318));
        this.elderPerson3.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson3.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00562, 0.0, -0.0322));
        this.elderPerson3.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson3.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0318));
        this.elderPerson3.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson4.setPaint(Color.WHITE);
        this.elderPerson4.setOpacity(1.0);
        this.elderPerson4.setName("elderPerson4");
        this.elderPerson4.setVehicle(this);
        this.elderPerson4.setOrientationRelativeToVehicle(new Orientation(0.0, -0.709143, 0.0, 0.705065));
        this.elderPerson4.setPositionRelativeToVehicle(new Position(-12.9, -0.122, 35.7));
        this.elderPerson4.setScale(new Scale(0.416, 0.416, 0.416));
        this.elderPerson4.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.elderPerson4.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0435));
        this.elderPerson4.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson4.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson4.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson4.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.elderPerson4.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0045, -0.0356));
        this.elderPerson4.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson4.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0345));
        this.elderPerson4.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0345));
        this.elderPerson4.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson4.getRightHip().setPositionRelativeToVehicle(new Position(0.0247, 0.0, -0.0412));
        this.elderPerson4.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson4.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson4.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.elderPerson4.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0247, 0.0, -0.0412));
        this.elderPerson4.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson4.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson4.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.elderPerson4.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0075, -0.0128, -0.031));
        this.elderPerson4.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson4.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson4.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson4.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.elderPerson4.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0164));
        this.elderPerson4.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson4.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0319));
        this.elderPerson4.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson4.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00562, 0.0, -0.0322));
        this.elderPerson4.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson4.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0319));
        this.elderPerson4.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson4.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0075, -0.0128, -0.031));
        this.elderPerson4.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson4.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson4.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson4.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.elderPerson4.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0164));
        this.elderPerson4.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson4.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0319));
        this.elderPerson4.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson4.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00562, 0.0, -0.0322));
        this.elderPerson4.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson4.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0319));
        this.elderPerson4.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson5.setPaint(Color.WHITE);
        this.elderPerson5.setOpacity(1.0);
        this.elderPerson5.setName("elderPerson5");
        this.elderPerson5.setVehicle(this);
        this.elderPerson5.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.elderPerson5.setPositionRelativeToVehicle(new Position(5.51, -0.181, 31.1));
        this.elderPerson5.setScale(new Scale(0.416, 0.416, 0.416));
        this.elderPerson5.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.elderPerson5.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0435));
        this.elderPerson5.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson5.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson5.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson5.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.elderPerson5.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0045, -0.0356));
        this.elderPerson5.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson5.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0345));
        this.elderPerson5.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0345));
        this.elderPerson5.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson5.getRightHip().setPositionRelativeToVehicle(new Position(0.0247, 0.0, -0.0412));
        this.elderPerson5.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson5.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson5.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.elderPerson5.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0247, 0.0, -0.0412));
        this.elderPerson5.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson5.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson5.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.elderPerson5.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0075, -0.0128, -0.031));
        this.elderPerson5.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson5.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson5.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson5.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.elderPerson5.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0164));
        this.elderPerson5.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson5.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0319));
        this.elderPerson5.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson5.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00562, 0.0, -0.0322));
        this.elderPerson5.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson5.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0319));
        this.elderPerson5.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson5.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0075, -0.0128, -0.031));
        this.elderPerson5.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson5.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson5.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson5.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.elderPerson5.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0164));
        this.elderPerson5.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson5.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0319));
        this.elderPerson5.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson5.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00562, 0.0, -0.0322));
        this.elderPerson5.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson5.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0319));
        this.elderPerson5.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson6.setPaint(Color.WHITE);
        this.elderPerson6.setOpacity(1.0);
        this.elderPerson6.setName("elderPerson6");
        this.elderPerson6.setVehicle(this);
        this.elderPerson6.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.elderPerson6.setPositionRelativeToVehicle(new Position(2.12, -0.225, 29.5));
        this.elderPerson6.setScale(new Scale(0.416, 0.416, 0.416));
        this.elderPerson6.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.elderPerson6.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0434));
        this.elderPerson6.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson6.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson6.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson6.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.elderPerson6.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00449, -0.0356));
        this.elderPerson6.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0344));
        this.elderPerson6.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.elderPerson6.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.elderPerson6.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0344));
        this.elderPerson6.getRightHip().setPositionRelativeToVehicle(new Position(0.0247, 0.0, -0.0412));
        this.elderPerson6.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson6.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson6.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.elderPerson6.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0247, 0.0, -0.0412));
        this.elderPerson6.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson6.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson6.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.elderPerson6.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00749, -0.0128, -0.0309));
        this.elderPerson6.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson6.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson6.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson6.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.elderPerson6.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0163));
        this.elderPerson6.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson6.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0318));
        this.elderPerson6.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson6.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00562, 0.0, -0.0322));
        this.elderPerson6.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson6.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0318));
        this.elderPerson6.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson6.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00749, -0.0128, -0.0309));
        this.elderPerson6.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson6.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson6.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.elderPerson6.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.elderPerson6.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0163));
        this.elderPerson6.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson6.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0318));
        this.elderPerson6.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson6.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00562, 0.0, -0.0322));
        this.elderPerson6.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson6.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0318));
        this.elderPerson6.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.riverRock.setPaint(Color.WHITE);
        this.riverRock.setOpacity(1.0);
        this.riverRock.setName("riverRock");
        this.riverRock.setVehicle(this);
        this.riverRock.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.riverRock.setPositionRelativeToVehicle(new Position(-1.3, -0.172, 35.5));
        this.elderPerson7.setPaint(Color.WHITE);
        this.elderPerson7.setOpacity(1.0);
        this.elderPerson7.setName("elderPerson7");
        this.elderPerson7.setVehicle(this);
        this.elderPerson7.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.elderPerson7.setPositionRelativeToVehicle(new Position(-5.14, -0.147, 27.3));
        this.elderPerson7.setScale(new Scale(0.414, 0.414, 0.414));
        this.elderPerson7.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0414));
        this.elderPerson7.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0164, -0.0433));
        this.elderPerson7.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0597));
        this.elderPerson7.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0597));
        this.elderPerson7.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0597));
        this.elderPerson7.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.028));
        this.elderPerson7.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00448, -0.0355));
        this.elderPerson7.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.031, -0.0343));
        this.elderPerson7.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.031, -0.0343));
        this.elderPerson7.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.031, -0.0343));
        this.elderPerson7.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.031, -0.0343));
        this.elderPerson7.getRightHip().setPositionRelativeToVehicle(new Position(0.0246, 0.0, -0.0411));
        this.elderPerson7.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.186));
        this.elderPerson7.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson7.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0567));
        this.elderPerson7.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0246, 0.0, -0.0411));
        this.elderPerson7.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.186));
        this.elderPerson7.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.elderPerson7.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0567));
        this.elderPerson7.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00747, -0.0127, -0.0308));
        this.elderPerson7.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0523));
        this.elderPerson7.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.38E-4, -0.119));
        this.elderPerson7.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0523));
        this.elderPerson7.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0538));
        this.elderPerson7.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.00299, -0.0163));
        this.elderPerson7.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson7.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0153, 2.8E-17, -0.0317));
        this.elderPerson7.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson7.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.0056, 0.0, -0.0321));
        this.elderPerson7.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0153));
        this.elderPerson7.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0108, 0.0, -0.0317));
        this.elderPerson7.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0149));
        this.elderPerson7.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00747, -0.0127, -0.0308));
        this.elderPerson7.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0523));
        this.elderPerson7.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.119));
        this.elderPerson7.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0523));
        this.elderPerson7.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0538));
        this.elderPerson7.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.00299, -0.0163));
        this.elderPerson7.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson7.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0153, 0.0, -0.0317));
        this.elderPerson7.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.elderPerson7.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.0056, 0.0, -0.0321));
        this.elderPerson7.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0153));
        this.elderPerson7.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0108, 0.0, -0.0317));
        this.elderPerson7.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0149));
        this.elderPerson8.setPaint(Color.WHITE);
        this.elderPerson8.setOpacity(1.0);
        this.elderPerson8.setName("elderPerson8");
        this.elderPerson8.setVehicle(this);
        this.elderPerson8.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.elderPerson8.setPositionRelativeToVehicle(new Position(-2.46, -0.19, 25.3));
        this.elderPerson8.setScale(new Scale(0.442, 0.442, 0.442));
        this.elderPerson8.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0442));
        this.elderPerson8.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0175, -0.0462));
        this.elderPerson8.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0637));
        this.elderPerson8.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0637));
        this.elderPerson8.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0637));
        this.elderPerson8.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0299));
        this.elderPerson8.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00478, -0.0378));
        this.elderPerson8.getRightEye().setPositionRelativeToVehicle(new Position(0.0139, 0.033, -0.0366));
        this.elderPerson8.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0141, 0.0331, -0.0366));
        this.elderPerson8.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0141, 0.0331, -0.0366));
        this.elderPerson8.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0139, 0.033, -0.0366));
        this.elderPerson8.getRightHip().setPositionRelativeToVehicle(new Position(0.0263, 0.0, -0.0438));
        this.elderPerson8.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.198));
        this.elderPerson8.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.173));
        this.elderPerson8.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0605));
        this.elderPerson8.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0263, 0.0, -0.0438));
        this.elderPerson8.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.198));
        this.elderPerson8.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.173));
        this.elderPerson8.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0605));
        this.elderPerson8.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00796, -0.0136, -0.0329));
        this.elderPerson8.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0557));
        this.elderPerson8.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.47E-4, -0.127));
        this.elderPerson8.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0557));
        this.elderPerson8.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0573));
        this.elderPerson8.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0194, -0.00318, -0.0174));
        this.elderPerson8.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0155));
        this.elderPerson8.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0163, 2.98E-17, -0.0338));
        this.elderPerson8.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0151));
        this.elderPerson8.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00597, 0.0, -0.0342));
        this.elderPerson8.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0163));
        this.elderPerson8.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0115, 0.0, -0.0338));
        this.elderPerson8.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0159));
        this.elderPerson8.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00796, -0.0136, -0.0329));
        this.elderPerson8.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0557));
        this.elderPerson8.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.127));
        this.elderPerson8.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0557));
        this.elderPerson8.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0573));
        this.elderPerson8.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0194, -0.00318, -0.0174));
        this.elderPerson8.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0155));
        this.elderPerson8.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0163, 0.0, -0.0338));
        this.elderPerson8.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0151));
        this.elderPerson8.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00597, 0.0, -0.0342));
        this.elderPerson8.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0163));
        this.elderPerson8.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0115, 0.0, -0.0338));
        this.elderPerson8.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0159));
        this.teenPerson.setPaint(Color.WHITE);
        this.teenPerson.setOpacity(1.0);
        this.teenPerson.setName("teenPerson");
        this.teenPerson.setVehicle(this);
        this.teenPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 0.997808, 0.0, 0.0661755));
        this.teenPerson.setPositionRelativeToVehicle(new Position(9.01, -0.0616, 32.4));
        this.teenPerson.setScale(new Scale(0.379, 0.379, 0.379));
        this.teenPerson.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0379));
        this.teenPerson.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.015, -0.0372));
        this.teenPerson.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0514));
        this.teenPerson.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0517));
        this.teenPerson.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0538));
        this.teenPerson.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0252));
        this.teenPerson.getMouth().setPositionRelativeToVehicle(new Position(0.0, -0.00273, -0.0311));
        this.teenPerson.getRightEye().setPositionRelativeToVehicle(new Position(0.012, 0.0283, -0.0314));
        this.teenPerson.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0121, 0.0284, -0.0314));
        this.teenPerson.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0121, 0.0284, -0.0314));
        this.teenPerson.getRightEyelid().setPositionRelativeToVehicle(new Position(0.012, 0.0283, -0.0314));
        this.teenPerson.getRightHip().setPositionRelativeToVehicle(new Position(0.0212, 0.0, -0.0376));
        this.teenPerson.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.16));
        this.teenPerson.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.139));
        this.teenPerson.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0519));
        this.teenPerson.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0212, 0.0, -0.0376));
        this.teenPerson.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.16));
        this.teenPerson.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.139));
        this.teenPerson.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0519));
        this.teenPerson.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00683, -0.0117, -0.027));
        this.teenPerson.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.26E-4, -0.103));
        this.teenPerson.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0462));
        this.teenPerson.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0161, -0.00273, -0.014));
        this.teenPerson.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0125));
        this.teenPerson.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.014, 3.77E-17, -0.0273));
        this.teenPerson.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0122));
        this.teenPerson.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00512, 0.0, -0.0276));
        this.teenPerson.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0132));
        this.teenPerson.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00991, 0.0, -0.0273));
        this.teenPerson.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0128));
        this.teenPerson.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00683, -0.0117, -0.027));
        this.teenPerson.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.103));
        this.teenPerson.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0462));
        this.teenPerson.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0161, -0.00273, -0.014));
        this.teenPerson.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0125));
        this.teenPerson.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.014, 0.0, -0.0273));
        this.teenPerson.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0122));
        this.teenPerson.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00512, 0.0, -0.0276));
        this.teenPerson.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0132));
        this.teenPerson.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00991, 0.0, -0.0273));
        this.teenPerson.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0128));
        this.elderPerson9.setPaint(Color.WHITE);
        this.elderPerson9.setOpacity(1.0);
        this.elderPerson9.setName("elderPerson9");
        this.elderPerson9.setVehicle(this);
        this.elderPerson9.setOrientationRelativeToVehicle(new Orientation(0.0, 0.999311, 0.0, 0.037115));
        this.elderPerson9.setPositionRelativeToVehicle(new Position(-1.83, 0.0, 24.5));
        this.elderPerson9.setScale(new Scale(0.438, 0.438, 0.438));
        this.elderPerson9.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0438));
        this.elderPerson9.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0174, -0.0457));
        this.elderPerson9.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0631));
        this.elderPerson9.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0631));
        this.elderPerson9.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0631));
        this.elderPerson9.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0296));
        this.elderPerson9.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00473, -0.0375));
        this.elderPerson9.getRightEye().setPositionRelativeToVehicle(new Position(0.0138, 0.0327, -0.0363));
        this.elderPerson9.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0139, 0.0328, -0.0363));
        this.elderPerson9.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0139, 0.0328, -0.0363));
        this.elderPerson9.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0138, 0.0327, -0.0363));
        this.elderPerson9.getRightHip().setPositionRelativeToVehicle(new Position(0.026, 0.0, -0.0434));
        this.elderPerson9.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.197));
        this.elderPerson9.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.171));
        this.elderPerson9.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson9.getLeftHip().setPositionRelativeToVehicle(new Position(-0.026, 0.0, -0.0434));
        this.elderPerson9.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.197));
        this.elderPerson9.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.171));
        this.elderPerson9.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.elderPerson9.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00789, -0.0135, -0.0326));
        this.elderPerson9.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.elderPerson9.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.46E-4, -0.126));
        this.elderPerson9.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.elderPerson9.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0568));
        this.elderPerson9.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0192, -0.00315, -0.0172));
        this.elderPerson9.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson9.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0162, 2.96E-17, -0.0335));
        this.elderPerson9.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson9.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00592, 0.0, -0.0339));
        this.elderPerson9.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0162));
        this.elderPerson9.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0114, 0.0, -0.0335));
        this.elderPerson9.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0158));
        this.elderPerson9.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00789, -0.0135, -0.0326));
        this.elderPerson9.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.elderPerson9.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.126));
        this.elderPerson9.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.elderPerson9.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0568));
        this.elderPerson9.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0192, -0.00315, -0.0172));
        this.elderPerson9.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson9.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0162, 0.0, -0.0335));
        this.elderPerson9.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson9.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00592, 0.0, -0.0339));
        this.elderPerson9.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0162));
        this.elderPerson9.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0114, 0.0, -0.0335));
        this.elderPerson9.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0158));
        this.adultPerson.setPaint(Color.WHITE);
        this.adultPerson.setOpacity(1.0);
        this.adultPerson.setName("adultPerson");
        this.adultPerson.setVehicle(this);
        this.adultPerson.setOrientationRelativeToVehicle(new Orientation(0.0, -0.621316, 0.0, 0.78356));
        this.adultPerson.setPositionRelativeToVehicle(new Position(2.32, -0.147, 28.1));
        this.adultPerson.setScale(new Scale(0.415, 0.415, 0.415));
        this.adultPerson.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0415));
        this.adultPerson.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0434));
        this.adultPerson.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.adultPerson.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.adultPerson.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.adultPerson.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.adultPerson.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00449, -0.0356));
        this.adultPerson.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0344));
        this.adultPerson.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.adultPerson.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0132, 0.0311, -0.0344));
        this.adultPerson.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0344));
        this.adultPerson.getRightHip().setPositionRelativeToVehicle(new Position(0.0247, 0.0, -0.0412));
        this.adultPerson.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.adultPerson.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.adultPerson.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.adultPerson.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0247, 0.0, -0.0412));
        this.adultPerson.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.adultPerson.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.162));
        this.adultPerson.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0569));
        this.adultPerson.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00748, -0.0128, -0.0309));
        this.adultPerson.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.adultPerson.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.38E-4, -0.12));
        this.adultPerson.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.adultPerson.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.adultPerson.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.00299, -0.0163));
        this.adultPerson.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.adultPerson.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0153, 2.81E-17, -0.0318));
        this.adultPerson.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.adultPerson.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00561, 0.0, -0.0322));
        this.adultPerson.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0153));
        this.adultPerson.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0318));
        this.adultPerson.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.adultPerson.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00748, -0.0128, -0.0309));
        this.adultPerson.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.adultPerson.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.adultPerson.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0524));
        this.adultPerson.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0539));
        this.adultPerson.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.00299, -0.0163));
        this.adultPerson.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.adultPerson.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0153, 0.0, -0.0318));
        this.adultPerson.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0142));
        this.adultPerson.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00561, 0.0, -0.0322));
        this.adultPerson.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0153));
        this.adultPerson.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0318));
        this.adultPerson.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.teenPerson2.setPaint(Color.WHITE);
        this.teenPerson2.setOpacity(1.0);
        this.teenPerson2.setName("teenPerson2");
        this.teenPerson2.setVehicle(this);
        this.teenPerson2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.539987, 0.0, 0.841673));
        this.teenPerson2.setPositionRelativeToVehicle(new Position(8.67, 0.0, 30.0));
        this.teenPerson2.setScale(new Scale(0.379, 0.379, 0.379));
        this.teenPerson2.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0379));
        this.teenPerson2.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.015, -0.0372));
        this.teenPerson2.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0514));
        this.teenPerson2.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0517));
        this.teenPerson2.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0538));
        this.teenPerson2.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0252));
        this.teenPerson2.getMouth().setPositionRelativeToVehicle(new Position(0.0, -0.00273, -0.0311));
        this.teenPerson2.getRightEye().setPositionRelativeToVehicle(new Position(0.012, 0.0283, -0.0314));
        this.teenPerson2.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0121, 0.0284, -0.0314));
        this.teenPerson2.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0121, 0.0284, -0.0314));
        this.teenPerson2.getRightEyelid().setPositionRelativeToVehicle(new Position(0.012, 0.0283, -0.0314));
        this.teenPerson2.getRightHip().setPositionRelativeToVehicle(new Position(0.0212, 0.0, -0.0376));
        this.teenPerson2.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.16));
        this.teenPerson2.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.139));
        this.teenPerson2.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0519));
        this.teenPerson2.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0212, 0.0, -0.0376));
        this.teenPerson2.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.16));
        this.teenPerson2.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.139));
        this.teenPerson2.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0519));
        this.teenPerson2.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00683, -0.0117, -0.027));
        this.teenPerson2.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson2.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.26E-4, -0.103));
        this.teenPerson2.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson2.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0462));
        this.teenPerson2.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0161, -0.00273, -0.014));
        this.teenPerson2.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0125));
        this.teenPerson2.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.014, 3.77E-17, -0.0273));
        this.teenPerson2.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0122));
        this.teenPerson2.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00512, 0.0, -0.0276));
        this.teenPerson2.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0132));
        this.teenPerson2.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0099, 0.0, -0.0273));
        this.teenPerson2.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0128));
        this.teenPerson2.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00683, -0.0117, -0.027));
        this.teenPerson2.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson2.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.103));
        this.teenPerson2.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0449));
        this.teenPerson2.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0462));
        this.teenPerson2.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0161, -0.00273, -0.014));
        this.teenPerson2.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0125));
        this.teenPerson2.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.014, 0.0, -0.0273));
        this.teenPerson2.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0122));
        this.teenPerson2.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00512, 0.0, -0.0276));
        this.teenPerson2.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0132));
        this.teenPerson2.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0099, 0.0, -0.0273));
        this.teenPerson2.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0128));
        this.elderPerson10.setPaint(Color.WHITE);
        this.elderPerson10.setOpacity(1.0);
        this.elderPerson10.setName("elderPerson10");
        this.elderPerson10.setVehicle(this);
        this.elderPerson10.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.elderPerson10.setPositionRelativeToVehicle(new Position(-15.6, 0.0, 23.6));
        this.elderPerson10.setScale(new Scale(0.416, 0.416, 0.416));
        this.elderPerson10.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.elderPerson10.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0435));
        this.elderPerson10.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson10.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson10.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.elderPerson10.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.elderPerson10.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0045, -0.0356));
        this.elderPerson10.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson10.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0133, 0.0312, -0.0345));
        this.elderPerson10.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0133, 0.0312, -0.0345));
        this.elderPerson10.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.elderPerson10.getRightHip().setPositionRelativeToVehicle(new Position(0.0248, 0.0, -0.0413));
        this.elderPerson10.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson10.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson10.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.elderPerson10.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0248, 0.0, -0.0413));
        this.elderPerson10.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.elderPerson10.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.elderPerson10.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.elderPerson10.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0075, -0.0128, -0.031));
        this.elderPerson10.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson10.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.elderPerson10.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson10.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.elderPerson10.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0164));
        this.elderPerson10.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson10.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0319));
        this.elderPerson10.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.elderPerson10.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00563, 0.0, -0.0323));
        this.elderPerson10.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson10.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0319));
        this.elderPerson10.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.elderPerson10.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0075, -0.0128, -0.031));
        this.elderPerson10.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson10.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.elderPerson10.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.elderPerson10.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.elderPerson10.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0164));
        this.elderPerson10.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.elderPerson10.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0319));
        this.elderPerson10.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.elderPerson10.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00563, 0.0, -0.0323));
        this.elderPerson10.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.elderPerson10.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0319));
        this.elderPerson10.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.adultPerson2.setPaint(Color.WHITE);
        this.adultPerson2.setOpacity(1.0);
        this.adultPerson2.setName("adultPerson2");
        this.adultPerson2.setVehicle(this);
        this.adultPerson2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.adultPerson2.setPositionRelativeToVehicle(new Position(-5.85, 0.0, 37.5));
        this.adultPerson2.setScale(new Scale(0.416, 0.416, 0.416));
        this.adultPerson2.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0416));
        this.adultPerson2.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0165, -0.0435));
        this.adultPerson2.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.adultPerson2.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.adultPerson2.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.06));
        this.adultPerson2.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0281));
        this.adultPerson2.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0045, -0.0356));
        this.adultPerson2.getRightEye().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.adultPerson2.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0133, 0.0312, -0.0345));
        this.adultPerson2.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0133, 0.0312, -0.0345));
        this.adultPerson2.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0131, 0.0311, -0.0345));
        this.adultPerson2.getRightHip().setPositionRelativeToVehicle(new Position(0.0248, 0.0, -0.0413));
        this.adultPerson2.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.adultPerson2.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.adultPerson2.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.adultPerson2.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0248, 0.0, -0.0413));
        this.adultPerson2.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.187));
        this.adultPerson2.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.163));
        this.adultPerson2.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.057));
        this.adultPerson2.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0075, -0.0128, -0.031));
        this.adultPerson2.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.adultPerson2.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.39E-4, -0.12));
        this.adultPerson2.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.adultPerson2.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.adultPerson2.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0182, -0.003, -0.0164));
        this.adultPerson2.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.adultPerson2.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0154, 2.81E-17, -0.0319));
        this.adultPerson2.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.adultPerson2.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00563, 0.0, -0.0323));
        this.adultPerson2.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.adultPerson2.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0319));
        this.adultPerson2.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.adultPerson2.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0075, -0.0128, -0.031));
        this.adultPerson2.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.adultPerson2.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.adultPerson2.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0525));
        this.adultPerson2.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.054));
        this.adultPerson2.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0182, -0.003, -0.0164));
        this.adultPerson2.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0146));
        this.adultPerson2.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0154, 0.0, -0.0319));
        this.adultPerson2.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.adultPerson2.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00563, 0.0, -0.0323));
        this.adultPerson2.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.adultPerson2.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0319));
        this.adultPerson2.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.teenPerson3.setPaint(Color.WHITE);
        this.teenPerson3.setOpacity(1.0);
        this.teenPerson3.setName("teenPerson3");
        this.teenPerson3.setVehicle(this);
        this.teenPerson3.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.teenPerson3.setPositionRelativeToVehicle(new Position(-6.15, 0.0, 25.2));
        this.teenPerson3.setScale(new Scale(0.375, 0.375, 0.375));
        this.teenPerson3.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0375));
        this.teenPerson3.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0149, -0.0368));
        this.teenPerson3.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0508));
        this.teenPerson3.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0511));
        this.teenPerson3.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0532));
        this.teenPerson3.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.025));
        this.teenPerson3.getMouth().setPositionRelativeToVehicle(new Position(0.0, -0.0027, -0.0307));
        this.teenPerson3.getRightEye().setPositionRelativeToVehicle(new Position(0.0118, 0.028, -0.0311));
        this.teenPerson3.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0119, 0.0281, -0.0311));
        this.teenPerson3.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0119, 0.0281, -0.0311));
        this.teenPerson3.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0118, 0.028, -0.0311));
        this.teenPerson3.getRightHip().setPositionRelativeToVehicle(new Position(0.021, 0.0, -0.0372));
        this.teenPerson3.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.158));
        this.teenPerson3.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.teenPerson3.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0513));
        this.teenPerson3.getLeftHip().setPositionRelativeToVehicle(new Position(-0.021, 0.0, -0.0372));
        this.teenPerson3.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.158));
        this.teenPerson3.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.teenPerson3.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0513));
        this.teenPerson3.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00676, -0.0115, -0.0267));
        this.teenPerson3.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0444));
        this.teenPerson3.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.25E-4, -0.102));
        this.teenPerson3.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0444));
        this.teenPerson3.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0457));
        this.teenPerson3.getRightThumb().setPositionRelativeToVehicle(new Position(-0.016, -0.0027, -0.0139));
        this.teenPerson3.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0124));
        this.teenPerson3.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0138, 3.73E-17, -0.027));
        this.teenPerson3.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0121));
        this.teenPerson3.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00507, 0.0, -0.0273));
        this.teenPerson3.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.013));
        this.teenPerson3.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00979, 0.0, -0.027));
        this.teenPerson3.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0127));
        this.teenPerson3.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00676, -0.0115, -0.0267));
        this.teenPerson3.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0444));
        this.teenPerson3.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.102));
        this.teenPerson3.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0444));
        this.teenPerson3.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0457));
        this.teenPerson3.getLeftThumb().setPositionRelativeToVehicle(new Position(0.016, -0.0027, -0.0139));
        this.teenPerson3.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0124));
        this.teenPerson3.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0138, 0.0, -0.027));
        this.teenPerson3.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0121));
        this.teenPerson3.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00507, 0.0, -0.0273));
        this.teenPerson3.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.013));
        this.teenPerson3.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00979, 0.0, -0.027));
        this.teenPerson3.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0127));
        this.teenPerson4.setPaint(Color.WHITE);
        this.teenPerson4.setOpacity(1.0);
        this.teenPerson4.setName("teenPerson4");
        this.teenPerson4.setVehicle(this);
        this.teenPerson4.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.teenPerson4.setPositionRelativeToVehicle(new Position(4.66, 0.0, 25.8));
        this.teenPerson4.setScale(new Scale(0.376, 0.376, 0.376));
        this.teenPerson4.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0376));
        this.teenPerson4.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0149, -0.0369));
        this.teenPerson4.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0509));
        this.teenPerson4.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0512));
        this.teenPerson4.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0533));
        this.teenPerson4.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.025));
        this.teenPerson4.getMouth().setPositionRelativeToVehicle(new Position(0.0, -0.00271, -0.0308));
        this.teenPerson4.getRightEye().setPositionRelativeToVehicle(new Position(0.0118, 0.0281, -0.0311));
        this.teenPerson4.getLeftEye().setPositionRelativeToVehicle(new Position(-0.012, 0.0281, -0.0311));
        this.teenPerson4.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.012, 0.0281, -0.0311));
        this.teenPerson4.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0118, 0.0281, -0.0311));
        this.teenPerson4.getRightHip().setPositionRelativeToVehicle(new Position(0.021, 0.0, -0.0372));
        this.teenPerson4.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.159));
        this.teenPerson4.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.teenPerson4.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0514));
        this.teenPerson4.getLeftHip().setPositionRelativeToVehicle(new Position(-0.021, 0.0, -0.0372));
        this.teenPerson4.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.159));
        this.teenPerson4.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.teenPerson4.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0514));
        this.teenPerson4.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00677, -0.0115, -0.0268));
        this.teenPerson4.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0445));
        this.teenPerson4.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.25E-4, -0.102));
        this.teenPerson4.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0445));
        this.teenPerson4.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0458));
        this.teenPerson4.getRightThumb().setPositionRelativeToVehicle(new Position(-0.016, -0.00271, -0.0139));
        this.teenPerson4.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0124));
        this.teenPerson4.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0139, 3.74E-17, -0.027));
        this.teenPerson4.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0121));
        this.teenPerson4.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00508, 0.0, -0.0274));
        this.teenPerson4.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.013));
        this.teenPerson4.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00981, 0.0, -0.027));
        this.teenPerson4.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0127));
        this.teenPerson4.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00677, -0.0115, -0.0268));
        this.teenPerson4.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0445));
        this.teenPerson4.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.102));
        this.teenPerson4.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0445));
        this.teenPerson4.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0458));
        this.teenPerson4.getLeftThumb().setPositionRelativeToVehicle(new Position(0.016, -0.00271, -0.0139));
        this.teenPerson4.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0124));
        this.teenPerson4.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0139, 0.0, -0.027));
        this.teenPerson4.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0121));
        this.teenPerson4.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00508, 0.0, -0.0274));
        this.teenPerson4.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.013));
        this.teenPerson4.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00981, 0.0, -0.027));
        this.teenPerson4.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0127));
        this.adultPerson3.setPaint(Color.WHITE);
        this.adultPerson3.setOpacity(1.0);
        this.adultPerson3.setName("adultPerson3");
        this.adultPerson3.setVehicle(this);
        this.adultPerson3.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.adultPerson3.setPositionRelativeToVehicle(new Position(7.67, 0.0, 28.3));
        this.adultPerson3.setScale(new Scale(0.419, 0.419, 0.419));
        this.adultPerson3.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0419));
        this.adultPerson3.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0166, -0.0438));
        this.adultPerson3.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0603));
        this.adultPerson3.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0603));
        this.adultPerson3.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0603));
        this.adultPerson3.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0283));
        this.adultPerson3.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00453, -0.0358));
        this.adultPerson3.getRightEye().setPositionRelativeToVehicle(new Position(0.0132, 0.0313, -0.0347));
        this.adultPerson3.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0133, 0.0313, -0.0347));
        this.adultPerson3.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0133, 0.0313, -0.0347));
        this.adultPerson3.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0132, 0.0313, -0.0347));
        this.adultPerson3.getRightHip().setPositionRelativeToVehicle(new Position(0.0249, 0.0, -0.0415));
        this.adultPerson3.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.188));
        this.adultPerson3.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.164));
        this.adultPerson3.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0573));
        this.adultPerson3.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0249, 0.0, -0.0415));
        this.adultPerson3.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.188));
        this.adultPerson3.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.164));
        this.adultPerson3.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0573));
        this.adultPerson3.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00754, -0.0129, -0.0312));
        this.adultPerson3.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0528));
        this.adultPerson3.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.4E-4, -0.121));
        this.adultPerson3.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0528));
        this.adultPerson3.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0543));
        this.adultPerson3.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0183, -0.00302, -0.0165));
        this.adultPerson3.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0147));
        this.adultPerson3.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0155, 2.83E-17, -0.0321));
        this.adultPerson3.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.adultPerson3.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00566, 0.0, -0.0324));
        this.adultPerson3.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0155));
        this.adultPerson3.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0109, 0.0, -0.0321));
        this.adultPerson3.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0151));
        this.adultPerson3.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00754, -0.0129, -0.0312));
        this.adultPerson3.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0528));
        this.adultPerson3.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.121));
        this.adultPerson3.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0528));
        this.adultPerson3.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0543));
        this.adultPerson3.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0183, -0.00302, -0.0165));
        this.adultPerson3.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0147));
        this.adultPerson3.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0155, 0.0, -0.0321));
        this.adultPerson3.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0143));
        this.adultPerson3.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00566, 0.0, -0.0324));
        this.adultPerson3.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0155));
        this.adultPerson3.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0109, 0.0, -0.0321));
        this.adultPerson3.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0151));
        this.adultPerson4.setPaint(Color.WHITE);
        this.adultPerson4.setOpacity(1.0);
        this.adultPerson4.setName("adultPerson4");
        this.adultPerson4.setVehicle(this);
        this.adultPerson4.setOrientationRelativeToVehicle(new Orientation(0.0, -0.722852, 0.0, 0.691003));
        this.adultPerson4.setPositionRelativeToVehicle(new Position(-7.01, 0.0, 39.1));
        this.adultPerson4.setScale(new Scale(0.411, 0.411, 0.411));
        this.adultPerson4.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0411));
        this.adultPerson4.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0163, -0.043));
        this.adultPerson4.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0593));
        this.adultPerson4.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0593));
        this.adultPerson4.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0593));
        this.adultPerson4.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0278));
        this.adultPerson4.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00444, -0.0352));
        this.adultPerson4.getRightEye().setPositionRelativeToVehicle(new Position(0.013, 0.0307, -0.0341));
        this.adultPerson4.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0131, 0.0308, -0.0341));
        this.adultPerson4.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0131, 0.0308, -0.0341));
        this.adultPerson4.getRightEyelid().setPositionRelativeToVehicle(new Position(0.013, 0.0307, -0.0341));
        this.adultPerson4.getRightHip().setPositionRelativeToVehicle(new Position(0.0244, 0.0, -0.0407));
        this.adultPerson4.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.185));
        this.adultPerson4.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.161));
        this.adultPerson4.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0563));
        this.adultPerson4.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0244, 0.0, -0.0407));
        this.adultPerson4.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.185));
        this.adultPerson4.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.161));
        this.adultPerson4.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0563));
        this.adultPerson4.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00741, -0.0126, -0.0306));
        this.adultPerson4.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0518));
        this.adultPerson4.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.37E-4, -0.118));
        this.adultPerson4.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0518));
        this.adultPerson4.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0533));
        this.adultPerson4.getRightThumb().setPositionRelativeToVehicle(new Position(-0.018, -0.00296, -0.0162));
        this.adultPerson4.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0144));
        this.adultPerson4.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0152, 2.78E-17, -0.0315));
        this.adultPerson4.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0141));
        this.adultPerson4.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00555, 0.0, -0.0318));
        this.adultPerson4.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0152));
        this.adultPerson4.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0107, 0.0, -0.0315));
        this.adultPerson4.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0148));
        this.adultPerson4.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00741, -0.0126, -0.0306));
        this.adultPerson4.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0518));
        this.adultPerson4.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.118));
        this.adultPerson4.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0518));
        this.adultPerson4.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0533));
        this.adultPerson4.getLeftThumb().setPositionRelativeToVehicle(new Position(0.018, -0.00296, -0.0162));
        this.adultPerson4.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0144));
        this.adultPerson4.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0152, 0.0, -0.0315));
        this.adultPerson4.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0141));
        this.adultPerson4.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00555, 0.0, -0.0318));
        this.adultPerson4.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0152));
        this.adultPerson4.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0107, 0.0, -0.0315));
        this.adultPerson4.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0148));
        this.dante.setPaint(Color.WHITE);
        this.dante.setOpacity(1.0);
        this.dante.setName("dante");
        this.dante.setVehicle(this);
        this.dante.setOrientationRelativeToVehicle(new Orientation(-0.0239913, -0.73467, -0.0200069, 0.677705));
        this.dante.setPositionRelativeToVehicle(new Position(12.3, 0.099, 32.2));
        this.dante.setScale(new Scale(0.402, 0.402, 0.402));
        this.dante.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0402));
        this.dante.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0159, -0.042));
        this.dante.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.058));
        this.dante.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.058));
        this.dante.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.058));
        this.dante.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0272));
        this.dante.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00435, -0.0344));
        this.dante.getRightEye().setPositionRelativeToVehicle(new Position(0.0127, 0.0301, -0.0333));
        this.dante.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0128, 0.0301, -0.0333));
        this.dante.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0128, 0.0301, -0.0333));
        this.dante.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0127, 0.0301, -0.0333));
        this.dante.getRightHip().setPositionRelativeToVehicle(new Position(0.0239, 0.0, -0.0399));
        this.dante.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.181));
        this.dante.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.157));
        this.dante.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0551));
        this.dante.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0239, 0.0, -0.0399));
        this.dante.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.181));
        this.dante.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.157));
        this.dante.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0551));
        this.dante.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00725, -0.0124, -0.0299));
        this.dante.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0507));
        this.dante.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.34E-4, -0.116));
        this.dante.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0507));
        this.dante.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0522));
        this.dante.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0176, -0.0029, -0.0158));
        this.dante.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0141));
        this.dante.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0149, 2.72E-17, -0.0308));
        this.dante.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0138));
        this.dante.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00544, 0.0, -0.0312));
        this.dante.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0149));
        this.dante.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0105, 0.0, -0.0308));
        this.dante.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0145));
        this.dante.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00725, -0.0124, -0.0299));
        this.dante.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0507));
        this.dante.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.116));
        this.dante.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0507));
        this.dante.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0522));
        this.dante.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0176, -0.0029, -0.0158));
        this.dante.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0141));
        this.dante.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0149, 0.0, -0.0308));
        this.dante.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0138));
        this.dante.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00544, 0.0, -0.0312));
        this.dante.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0149));
        this.dante.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0105, 0.0, -0.0308));
        this.dante.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0145));
        this.adultPerson5.setPaint(Color.WHITE);
        this.adultPerson5.setOpacity(1.0);
        this.adultPerson5.setName("adultPerson5");
        this.adultPerson5.setVehicle(this);
        this.adultPerson5.setOrientationRelativeToVehicle(new Orientation(0.0, -0.74004, 0.0, 0.672562));
        this.adultPerson5.setPositionRelativeToVehicle(new Position(12.3, 0.0823, 32.3));
        this.adultPerson5.setScale(new Scale(0.437, 0.437, 0.437));
        this.adultPerson5.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0437));
        this.adultPerson5.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0173, -0.0457));
        this.adultPerson5.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0631));
        this.adultPerson5.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0631));
        this.adultPerson5.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0631));
        this.adultPerson5.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0296));
        this.adultPerson5.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00473, -0.0374));
        this.adultPerson5.getRightEye().setPositionRelativeToVehicle(new Position(0.0138, 0.0327, -0.0363));
        this.adultPerson5.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0139, 0.0328, -0.0363));
        this.adultPerson5.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0139, 0.0328, -0.0363));
        this.adultPerson5.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0138, 0.0327, -0.0363));
        this.adultPerson5.getRightHip().setPositionRelativeToVehicle(new Position(0.026, 0.0, -0.0434));
        this.adultPerson5.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.197));
        this.adultPerson5.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.171));
        this.adultPerson5.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.adultPerson5.getLeftHip().setPositionRelativeToVehicle(new Position(-0.026, 0.0, -0.0434));
        this.adultPerson5.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.197));
        this.adultPerson5.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.171));
        this.adultPerson5.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0599));
        this.adultPerson5.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00788, -0.0135, -0.0326));
        this.adultPerson5.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.adultPerson5.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.46E-4, -0.126));
        this.adultPerson5.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.adultPerson5.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0568));
        this.adultPerson5.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0192, -0.00315, -0.0172));
        this.adultPerson5.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.adultPerson5.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0162, 2.96E-17, -0.0335));
        this.adultPerson5.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.adultPerson5.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00591, 0.0, -0.0339));
        this.adultPerson5.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0162));
        this.adultPerson5.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0114, 0.0, -0.0335));
        this.adultPerson5.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0158));
        this.adultPerson5.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00788, -0.0135, -0.0326));
        this.adultPerson5.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.adultPerson5.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.126));
        this.adultPerson5.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0552));
        this.adultPerson5.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0568));
        this.adultPerson5.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0192, -0.00315, -0.0172));
        this.adultPerson5.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0154));
        this.adultPerson5.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0162, 0.0, -0.0335));
        this.adultPerson5.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.015));
        this.adultPerson5.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00591, 0.0, -0.0339));
        this.adultPerson5.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0162));
        this.adultPerson5.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0114, 0.0, -0.0335));
        this.adultPerson5.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0158));
        this.alien.setPaint(Color.WHITE);
        this.alien.setOpacity(0.0);
        this.alien.setName("alien");
        this.alien.setVehicle(this);
        this.alien.setOrientationRelativeToVehicle(new Orientation(0.0, -0.72881, 0.0, 0.684716));
        this.alien.setPositionRelativeToVehicle(new Position(1.8, 0.323, 30.7));
        this.alien.setScale(new Scale(0.0971, 0.0971, 0.0971));
        this.alien.getSpineBase().setPositionRelativeToVehicle(new Position(-1.55E-4, 6.07E-16, -5.22E-6));
        this.alien.getSpineMiddle().setPositionRelativeToVehicle(new Position(-7.37E-20, 0.0, -0.0155));
        this.alien.getSpineUpper().setPositionRelativeToVehicle(new Position(1.01E-19, -1.64E-17, -0.0235));
        this.alien.getNeck().setPositionRelativeToVehicle(new Position(-1.54E-19, -4.83E-17, -0.00587));
        this.alien.getHead().setPositionRelativeToVehicle(new Position(-4.79E-35, -1.03E-17, -0.00612));
        this.alien.getMouth().setPositionRelativeToVehicle(new Position(-6.96E-5, 0.00313, -0.0109));
        this.alien.getRightEye().setPositionRelativeToVehicle(new Position(0.00753, 0.0232, -0.00487));
        this.alien.getLeftEye().setPositionRelativeToVehicle(new Position(-0.00767, 0.0232, -0.00487));
        this.alien.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.00767, 0.0232, -0.00487));
        this.alien.getRightEyelid().setPositionRelativeToVehicle(new Position(0.00753, 0.0232, -0.00487));
        this.alien.getRightHip().setPositionRelativeToVehicle(new Position(0.012, -2.4E-4, -0.00934));
        this.alien.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 1.8E-17, -0.014));
        this.alien.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 1.72E-18, -0.0138));
        this.alien.getRightFoot().setPositionRelativeToVehicle(new Position(-6.9E-18, 6.03E-18, -0.0101));
        this.alien.getLeftHip().setPositionRelativeToVehicle(new Position(-0.012, -2.4E-4, -0.00934));
        this.alien.getLeftKnee().setPositionRelativeToVehicle(new Position(-1.72E-18, 6.6E-18, -0.014));
        this.alien.getLeftAnkle().setPositionRelativeToVehicle(new Position(-1.72E-18, -6.03E-18, -0.0138));
        this.alien.getLeftFoot().setPositionRelativeToVehicle(new Position(-1.72E-18, -1.25E-17, -0.0101));
        this.alien.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00612, -0.00567, -2.95E-4));
        this.alien.getRightShoulder().setPositionRelativeToVehicle(new Position(-2.59E-18, -2.76E-17, -0.00724));
        this.alien.getRightElbow().setPositionRelativeToVehicle(new Position(-5.6E-17, -1.38E-17, -0.0194));
        this.alien.getRightWrist().setPositionRelativeToVehicle(new Position(-4.14E-17, -4.14E-17, -0.0153));
        this.alien.getRightHand().setPositionRelativeToVehicle(new Position(-2.59E-18, 0.0, -0.00674));
        this.alien.getRightThumb().setPositionRelativeToVehicle(new Position(-0.00255, -0.0012, -0.00999));
        this.alien.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(-2.07E-17, 8.28E-17, -0.00618));
        this.alien.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-3.27E-4, -0.00136, -0.0107));
        this.alien.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(-3.45E-18, 0.0, -0.00648));
        this.alien.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(0.00242, -0.00149, -0.0107));
        this.alien.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(2.11E-17, 2.76E-17, -0.00627));
        this.alien.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00484, -0.00167, -0.00979));
        this.alien.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(8.62E-18, 2.76E-17, -0.0057));
        this.alien.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00612, -0.00567, -2.95E-4));
        this.alien.getLeftShoulder().setPositionRelativeToVehicle(new Position(1.72E-18, -8.28E-17, -0.00724));
        this.alien.getLeftElbow().setPositionRelativeToVehicle(new Position(-1.51E-17, 1.1E-14, -0.0194));
        this.alien.getLeftWrist().setPositionRelativeToVehicle(new Position(5.65E-17, 8.68E-15, -0.0153));
        this.alien.getLeftHand().setPositionRelativeToVehicle(new Position(6.03E-18, -1.1E-16, -0.00674));
        this.alien.getLeftThumb().setPositionRelativeToVehicle(new Position(0.00255, -0.0012, -0.00999));
        this.alien.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(1.38E-17, 2.76E-17, -0.00618));
        this.alien.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(3.27E-4, -0.00136, -0.0107));
        this.alien.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(-5.17E-18, 2.76E-17, -0.00648));
        this.alien.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00242, -0.00149, -0.0107));
        this.alien.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(-7.76E-18, -2.76E-17, -0.00627));
        this.alien.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00484, -0.00167, -0.00979));
        this.alien.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, -2.76E-17, -0.0057));
        this.sinner1.setPaint(Color.WHITE);
        this.sinner1.setOpacity(1.0);
        this.sinner1.setName("sinner1");
        this.sinner1.setVehicle(this.pixie);
        this.sinner1.setOrientationRelativeToVehicle(new Orientation(0.0668917, -0.0200108, -0.955712, 0.285903));
        this.sinner1.setPositionRelativeToVehicle(new Position(0.299, 5.58, 0.107));
        this.sinner1.setScale(new Scale(0.418, 0.418, 0.418));
        this.sinner1.getPelvis().setPositionRelativeToVehicle(new Position(0.0, -3.16E-8, -0.0154));
        this.sinner1.getSpineBase().setPositionRelativeToVehicle(new Position(-4.04E-8, 0.00941, -0.0279));
        this.sinner1.getSpineMiddle().setPositionRelativeToVehicle(new Position(-1.8E-14, -2.99E-8, -0.0377));
        this.sinner1.getSpineUpper().setPositionRelativeToVehicle(new Position(2.1E-8, 0.0, -0.0399));
        this.sinner1.getNeck().setPositionRelativeToVehicle(new Position(-2.1E-8, 0.0, -0.0471));
        this.sinner1.getHead().setPositionRelativeToVehicle(new Position(1.01E-13, 0.0, -0.0264));
        this.sinner1.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0105, -0.0346));
        this.sinner1.getRightEye().setPositionRelativeToVehicle(new Position(0.0109, 0.0316, -0.0279));
        this.sinner1.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0109, 0.0316, -0.0279));
        this.sinner1.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0109, 0.0316, -0.0279));
        this.sinner1.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0109, 0.0316, -0.0279));
        this.sinner1.getRightHip().setPositionRelativeToVehicle(new Position(0.0211, 1.26E-8, -0.0158));
        this.sinner1.getRightKnee().setPositionRelativeToVehicle(new Position(-3.72E-13, 2.43E-17, -0.11));
        this.sinner1.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, -7.93E-11, -0.117));
        this.sinner1.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 1.34E-17, -0.0425));
        this.sinner1.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0211, -5.23E-8, -0.0158));
        this.sinner1.getLeftKnee().setPositionRelativeToVehicle(new Position(-8.79E-14, -5.8E-8, -0.11));
        this.sinner1.getLeftAnkle().setPositionRelativeToVehicle(new Position(1.56E-13, -1.15E-7, -0.117));
        this.sinner1.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 1.34E-17, -0.0425));
        this.sinner1.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0113, -0.013, -0.0361));
        this.sinner1.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 4.16E-8, -0.0297));
        this.sinner1.getRightElbow().setPositionRelativeToVehicle(new Position(1.68E-7, -5.49E-8, -0.0761));
        this.sinner1.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, -1.09E-13, -0.0335));
        this.sinner1.getRightHand().setPositionRelativeToVehicle(new Position(1.88E-17, -9.65E-14, -0.0297));
        this.sinner1.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0122, -0.00264, -0.0119));
        this.sinner1.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(5.2E-17, -2.79E-14, -0.00904));
        this.sinner1.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.00941, -8.76E-14, -0.0237));
        this.sinner1.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(1.88E-17, -2.81E-14, -0.00866));
        this.sinner1.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00226, -8.08E-14, -0.0241));
        this.sinner1.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(-1.31E-18, -3.06E-14, -0.00941));
        this.sinner1.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00979, -6.79E-14, -0.0226));
        this.sinner1.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(-3.47E-17, -3.06E-14, -0.00866));
        this.sinner1.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0113, -0.013, -0.0361));
        this.sinner1.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0297));
        this.sinner1.getLeftElbow().setPositionRelativeToVehicle(new Position(2.68E-7, 2.47E-13, -0.0761));
        this.sinner1.getLeftWrist().setPositionRelativeToVehicle(new Position(1.15E-7, 1.09E-13, -0.0335));
        this.sinner1.getLeftHand().setPositionRelativeToVehicle(new Position(1.17E-7, 9.71E-14, -0.0297));
        this.sinner1.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0122, -0.00264, -0.0119));
        this.sinner1.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(1.09E-9, 2.78E-14, -0.00904));
        this.sinner1.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.00941, -5.35E-17, -0.0237));
        this.sinner1.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.00866));
        this.sinner1.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00226, -1.07E-16, -0.0241));
        this.sinner1.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.00941));
        this.sinner1.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00979, 0.0, -0.0226));
        this.sinner1.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(1.12E-9, 0.0, -0.00866));
        this.adultPerson6.setPaint(Color.WHITE);
        this.adultPerson6.setOpacity(1.0);
        this.adultPerson6.setName("adultPerson6");
        this.adultPerson6.setVehicle(this.pixie);
        this.adultPerson6.setOrientationRelativeToVehicle(new Orientation(0.00618969, 0.436952, -0.899165, 0.0231674));
        this.adultPerson6.setPositionRelativeToVehicle(new Position(0.0713, 5.52, -0.224));
        this.adultPerson6.setScale(new Scale(0.307, 0.307, 0.307));
        this.adultPerson6.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0307));
        this.adultPerson6.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0122, -0.0321));
        this.adultPerson6.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0443));
        this.adultPerson6.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0443));
        this.adultPerson6.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0443));
        this.adultPerson6.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0208));
        this.adultPerson6.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00332, -0.0263));
        this.adultPerson6.getRightEye().setPositionRelativeToVehicle(new Position(0.00968, 0.023, -0.0255));
        this.adultPerson6.getLeftEye().setPositionRelativeToVehicle(new Position(-0.00978, 0.023, -0.0254));
        this.adultPerson6.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.00978, 0.023, -0.0254));
        this.adultPerson6.getRightEyelid().setPositionRelativeToVehicle(new Position(0.00968, 0.023, -0.0255));
        this.adultPerson6.getRightHip().setPositionRelativeToVehicle(new Position(0.0183, 0.0, -0.0304));
        this.adultPerson6.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.adultPerson6.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.adultPerson6.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0421));
        this.adultPerson6.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0183, 0.0, -0.0304));
        this.adultPerson6.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.adultPerson6.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.adultPerson6.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0421));
        this.adultPerson6.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00553, -0.00944, -0.0229));
        this.adultPerson6.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson6.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.02E-4, -0.0885));
        this.adultPerson6.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson6.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0398));
        this.adultPerson6.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0135, -0.00221, -0.0121));
        this.adultPerson6.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0108));
        this.adultPerson6.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0113, 2.07E-17, -0.0235));
        this.adultPerson6.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0105));
        this.adultPerson6.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00415, 0.0, -0.0238));
        this.adultPerson6.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0113));
        this.adultPerson6.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00802, 0.0, -0.0235));
        this.adultPerson6.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0111));
        this.adultPerson6.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00553, -0.00944, -0.0229));
        this.adultPerson6.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson6.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0885));
        this.adultPerson6.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson6.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0398));
        this.adultPerson6.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0135, -0.00221, -0.0121));
        this.adultPerson6.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0108));
        this.adultPerson6.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0113, 0.0, -0.0235));
        this.adultPerson6.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0105));
        this.adultPerson6.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00415, 0.0, -0.0238));
        this.adultPerson6.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0113));
        this.adultPerson6.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00802, 0.0, -0.0235));
        this.adultPerson6.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0111));
        this.adultPerson7.setPaint(Color.WHITE);
        this.adultPerson7.setOpacity(1.0);
        this.adultPerson7.setName("adultPerson7");
        this.adultPerson7.setVehicle(this.pixie);
        this.adultPerson7.setOrientationRelativeToVehicle(new Orientation(0.421862, -0.372014, 0.826623, 0.0182338));
        this.adultPerson7.setPositionRelativeToVehicle(new Position(-0.329, 5.45, 0.311));
        this.adultPerson7.setScale(new Scale(0.307, 0.307, 0.307));
        this.adultPerson7.getPelvis().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0307));
        this.adultPerson7.getSpineBase().setPositionRelativeToVehicle(new Position(0.0, 0.0122, -0.0321));
        this.adultPerson7.getSpineMiddle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0443));
        this.adultPerson7.getSpineUpper().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0443));
        this.adultPerson7.getNeck().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0443));
        this.adultPerson7.getHead().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0207));
        this.adultPerson7.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.00332, -0.0263));
        this.adultPerson7.getRightEye().setPositionRelativeToVehicle(new Position(0.00968, 0.023, -0.0255));
        this.adultPerson7.getLeftEye().setPositionRelativeToVehicle(new Position(-0.00978, 0.023, -0.0254));
        this.adultPerson7.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.00978, 0.023, -0.0254));
        this.adultPerson7.getRightEyelid().setPositionRelativeToVehicle(new Position(0.00968, 0.023, -0.0255));
        this.adultPerson7.getRightHip().setPositionRelativeToVehicle(new Position(0.0183, 0.0, -0.0304));
        this.adultPerson7.getRightKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.adultPerson7.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.adultPerson7.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0421));
        this.adultPerson7.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0183, 0.0, -0.0304));
        this.adultPerson7.getLeftKnee().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.138));
        this.adultPerson7.getLeftAnkle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.12));
        this.adultPerson7.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0421));
        this.adultPerson7.getRightClavicle().setPositionRelativeToVehicle(new Position(0.00553, -0.00944, -0.0229));
        this.adultPerson7.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson7.getRightElbow().setPositionRelativeToVehicle(new Position(0.0, 1.02E-4, -0.0885));
        this.adultPerson7.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson7.getRightHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0398));
        this.adultPerson7.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0135, -0.00221, -0.0121));
        this.adultPerson7.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0108));
        this.adultPerson7.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0113, 2.07E-17, -0.0235));
        this.adultPerson7.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0105));
        this.adultPerson7.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00415, 0.0, -0.0238));
        this.adultPerson7.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0113));
        this.adultPerson7.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.00802, 0.0, -0.0235));
        this.adultPerson7.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0111));
        this.adultPerson7.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.00553, -0.00944, -0.0229));
        this.adultPerson7.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson7.getLeftElbow().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0885));
        this.adultPerson7.getLeftWrist().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0387));
        this.adultPerson7.getLeftHand().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0398));
        this.adultPerson7.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0135, -0.00221, -0.0121));
        this.adultPerson7.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0108));
        this.adultPerson7.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0113, 0.0, -0.0235));
        this.adultPerson7.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0105));
        this.adultPerson7.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00415, 0.0, -0.0238));
        this.adultPerson7.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0113));
        this.adultPerson7.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.00802, 0.0, -0.0235));
        this.adultPerson7.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0111));
        this.gopherHole.setPaint(Color.WHITE);
        this.gopherHole.setOpacity(1.0);
        this.gopherHole.setName("gopherHole");
        this.gopherHole.setVehicle(this);
        this.gopherHole.setOrientationRelativeToVehicle(new Orientation(0.0, -0.768478, 0.0, 0.639876));
        this.gopherHole.setPositionRelativeToVehicle(new Position(-2.52, 0.0821, 30.4));
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

    public Cave getCave() {
        return this.cave;
    }

    public IceFloe getIceFloe() {
        return this.iceFloe;
    }

    public Pixie getPixie() {
        return this.pixie;
    }

    public Curupira getCurupira() {
        return this.curupira;
    }

    public Curupira getCurupira2() {
        return this.curupira2;
    }

    public Curupira getCurupira3() {
        return this.curupira3;
    }

    public ElderPerson getElderPerson() {
        return this.elderPerson;
    }

    public ElderPerson getElderPerson2() {
        return this.elderPerson2;
    }

    public ElderPerson getElderPerson3() {
        return this.elderPerson3;
    }

    public ElderPerson getElderPerson4() {
        return this.elderPerson4;
    }

    public ElderPerson getElderPerson5() {
        return this.elderPerson5;
    }

    public ElderPerson getElderPerson6() {
        return this.elderPerson6;
    }

    public RiverRock getRiverRock() {
        return this.riverRock;
    }

    public ElderPerson getElderPerson7() {
        return this.elderPerson7;
    }

    public ElderPerson getElderPerson8() {
        return this.elderPerson8;
    }

    public TeenPerson getTeenPerson() {
        return this.teenPerson;
    }

    public ElderPerson getElderPerson9() {
        return this.elderPerson9;
    }

    public AdultPerson getAdultPerson() {
        return this.adultPerson;
    }

    public TeenPerson getTeenPerson2() {
        return this.teenPerson2;
    }

    public ElderPerson getElderPerson10() {
        return this.elderPerson10;
    }

    public AdultPerson getAdultPerson2() {
        return this.adultPerson2;
    }

    public TeenPerson getTeenPerson3() {
        return this.teenPerson3;
    }

    public TeenPerson getTeenPerson4() {
        return this.teenPerson4;
    }

    public AdultPerson getAdultPerson3() {
        return this.adultPerson3;
    }

    public AdultPerson getAdultPerson4() {
        return this.adultPerson4;
    }

    public ElderPerson getDante() {
        return this.dante;
    }

    public AdultPerson getAdultPerson5() {
        return this.adultPerson5;
    }

    public Alien getAlien() {
        return this.alien;
    }

    public ChildPerson getSinner1() {
        return this.sinner1;
    }

    public AdultPerson getAdultPerson6() {
        return this.adultPerson6;
    }

    public AdultPerson getAdultPerson7() {
        return this.adultPerson7;
    }

    public GopherHole getGopherHole() {
        return this.gopherHole;
    }
    // </editor-fold>

public void dialog(){
    this.adultPerson5.say("we have arrived at the final circle", Move.duration(2));
    this.adultPerson5.say("only the most serious offenders spend eternity here", Move.duration(2));
    this.adultPerson5.say("the more severe the cime is the deeper they are in the ice", Move.duration(2));
    this.dante.say("whoh, who would have thought thats what satan looks like", Move.duration(2));
    this.dante.say("what in his mouth?", Move.duration(2));
    this.camera.moveTo(alien);
    this.camera.pointAt(this.adultPerson6);
    this.adultPerson5.say("Judas Iscariot he betrayed jesus", Move.duration(2));
    this.adultPerson6.say("thats me");
    this.adultPerson5.say("brutus and cassius, they betrayed Ceasar", Move.duration(2));
    this.adultPerson7.say("i'm Brutus", Move.duration(1));
    this.sinner1.say("i'm Cassius", Move.duration(1));
    this.camera.move(MoveDirection.BACKWARD, 7);
    //this.camera.pointAt(this.dante);
    
    this.dante.say("how do i get out of here");
    this.adultPerson5.say("jump down the hole you will land on the other side of the planet", Move.duration(2));

    doTogether(() -> {
     this.dante.moveTo(this.gopherHole, Move.duration(8));
    }, () -> {
      walking(dante);
    });
    
     doTogether(() -> {
     this.dante.move(MoveDirection.DOWN, 40);
    }, () -> {
      this.dante.say("weeee");
    });
    
    

}
public void flap(){
   this.pixie.getLeftClavicle().turn(TurnDirection.BACKWARD, .5);
   this.pixie.getLeftClavicle().turn(TurnDirection.BACKWARD, .4);
}
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
}
}