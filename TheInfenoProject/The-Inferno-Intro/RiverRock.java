// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.RiverRockResource;
// </editor-fold>

class RiverRock extends Prop {

    /* Construct new RiverRock */
    public RiverRock(RiverRockResource resource) {
        super(resource);
    }

    public void setRiverRockResource(RiverRockResource riverRockResource) {
        this.setJointedModelResource(riverRockResource);
    }
}
