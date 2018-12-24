// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.FlatRocksResource;
// </editor-fold>

class FlatRocks extends Prop {

    /* Construct new FlatRocks */
    public FlatRocks(FlatRocksResource resource) {
        super(resource);
    }

    public void setFlatRocksResource(FlatRocksResource flatRocksResource) {
        this.setJointedModelResource(flatRocksResource);
    }
}
