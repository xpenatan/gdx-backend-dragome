package com.github.xpenatan.gdx.backend.web.dom;

/**
 * @author xpenatan
 */
public interface DocumentWrapper extends ElementWrapper {

	public ElementWrapper getDocumentElement();

	public String getCompatMode();

	HTMLElementWrapper getElementById(String id);

	public NodeWrapper createTextNode(NodeWrapper text);

	public ElementWrapper createElement(String value);
}
