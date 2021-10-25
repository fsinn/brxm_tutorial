package com.fsinn.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import com.fsinn.beans.Imageset;

@HippoEssentialsGenerated(internalName = "brxm_tutorial:newsdocument")
@Node(jcrType = "brxm_tutorial:newsdocument")
public class NewsDocument extends HippoDocument {
    /** 
     * The document type of the news document.
     */
    public static final String DOCUMENT_TYPE = "brxm_tutorial:newsdocument";
    private static final String TITLE = "brxm_tutorial:title";
    private static final String DATE = "brxm_tutorial:date";
    private static final String INTRODUCTION = "brxm_tutorial:introduction";
    private static final String IMAGE = "brxm_tutorial:image";
    private static final String CONTENT = "brxm_tutorial:content";
    private static final String LOCATION = "brxm_tutorial:location";
    private static final String AUTHOR = "brxm_tutorial:author";
    private static final String SOURCE = "brxm_tutorial:source";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:title")
    public String getTitle() {
        return getSingleProperty(TITLE);
    }

    /** 
     * Get the date of the document.
     * @return the date
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:date")
    public Calendar getDate() {
        return getSingleProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:introduction")
    public String getIntroduction() {
        return getSingleProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:location")
    public String getLocation() {
        return getSingleProperty(LOCATION);
    }

    /** 
     * Get the author of the document.
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:author")
    public String getAuthor() {
        return getSingleProperty(AUTHOR);
    }

    /** 
     * Get the source of the document.
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "brxm_tutorial:source")
    public String getSource() {
        return getSingleProperty(SOURCE);
    }

    @HippoEssentialsGenerated(internalName = "brxm_tutorial:image")
    public Imageset getImage() {
        return getLinkedBean("brxm_tutorial:image", Imageset.class);
    }
}
