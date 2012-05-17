/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.examproject.blossom.component.paragraph;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.RepositoryException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import info.magnolia.module.blossom.annotation.Area;
import info.magnolia.module.blossom.annotation.AvailableComponentClasses;
import info.magnolia.module.blossom.annotation.TabFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.module.blossom.annotation.TemplateDescription;
import info.magnolia.module.blossom.dialog.TabBuilder;

import org.examproject.blossom.component.item.FourColumnRowItemComponent;
import org.examproject.blossom.component.item.OneColumnRowItemComponent;
import org.examproject.blossom.component.item.ThreeColumnRowItemComponent;
import org.examproject.blossom.component.item.TwoColumnRowItemComponent;

/**
 * @author hiroxpepe
 */
@Controller
@Template(
    id="exmp-blossom:components/tableParagraph",
    title="Table Paragraph"
)
@TemplateDescription("the component of a table paragraph.")
public class TableParagraphComponent {
    
    private static final Logger LOG = LoggerFactory.getLogger(
        TableParagraphComponent.class
    );
    
    ///////////////////////////////////////////////////////////////////////////
    // the area class of the table.

    @Controller
    @Area(
        value="tableParagraphItem",
        title="Table Item"
    )
    @AvailableComponentClasses({
        FourColumnRowItemComponent.class,
        OneColumnRowItemComponent.class,
        ThreeColumnRowItemComponent.class,
        TwoColumnRowItemComponent.class           
    })
    public static class TableParagraphItemArea {

        @RequestMapping("/tableParagraph/item")
        public String render(
            ModelMap model,
            Node content
        ) throws RepositoryException {
            
            return "areas/table.jsp";
        }

        @TabFactory("Table")
        public void addDialog(TabBuilder tab) {
            tab.addStatic("there is no item to be set yet.");
        }

    }
    
    ///////////////////////////////////////////////////////////////////////////
    // this class public methods.
    
    @RequestMapping("/tableParagraph") 
    public String render(
        ModelMap model,
        Node content
    ) throws RepositoryException {
        LOG.debug("called.");
        
        return "components/paragraph/tableParagraph.jsp";
    }
    
    @TabFactory("Table Paragraph")
    public void addDialog(TabBuilder tab) {
        tab.addEdit(
            "title",
            "Title",
            "the title of the paragraph."
        ); 
    }
    
}