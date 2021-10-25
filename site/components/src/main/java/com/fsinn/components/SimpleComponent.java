package com.fsinn.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.request.HstRequestContext;

public class SimpleComponent extends BaseHstComponent {
    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);

        beforeRender(request);
    }

    private void beforeRender(HstRequest request) {
        final HstRequestContext ctx = request.getRequestContext();

        HippoBean document = ctx.getContentBean();

        if (document != null) {
            request.setAttribute("document", document);
        }
    }
}
