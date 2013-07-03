/*
 * Copyright 2010 The gwtquery plugins team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwtquery.plugins.droppable.client.permissionmanagersample2;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * Resources used in this example.
 *
 * @author Julien Dramaix (julien.dramaix@gmail.com)
 *
 */
public interface Resource extends ClientBundle {

  interface Css extends CssResource {
    String dragHelper();

    String droppableHover();

    String memberList();

    String permissionTree();
  }

  Resource INSTANCE = GWT.create(Resource.class);

  @Source("style.css")
  Css css();

  ImageResource contact();

}
