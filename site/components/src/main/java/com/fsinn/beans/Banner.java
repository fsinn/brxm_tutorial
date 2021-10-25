package com.fsinn.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.fsinn.beans.Imageset;

@HippoEssentialsGenerated(internalName = "brxm_tutorial:bannerdocument")
@Node(jcrType = "brxm_tutorial:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:title")
    public String getTitle() {
        return getSingleProperty("brxm_tutorial:title");
    }

    @HippoEssentialsGenerated(internalName = "brxm_tutorial:content")
    public HippoHtml getContent() {
        return getHippoHtml("brxm_tutorial:content");
    }

    @HippoEssentialsGenerated(internalName = "brxm_tutorial:link")
    public HippoBean getLink() {
        return getLinkedBean("brxm_tutorial:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "brxm_tutorial:image")
    public Imageset getImage() {
        return getLinkedBean("brxm_tutorial:image", Imageset.class);
    }
}
