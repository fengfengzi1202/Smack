/**
 *
 * Copyright 2020 Paul Schaub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jivesoftware.smackx.stanza_content_encryption.element;

import org.jivesoftware.smack.packet.ExtensionElement;

/**
 * Affix element that is identified by element name and namespace.
 * You should extend this interface with your custom affix extension elements
 * and also provide a {@link org.jivesoftware.smackx.stanza_content_encryption.provider.AffixExtensionElementProvider}
 * for them.
 *
 * @see <a href="https://xmpp.org/extensions/xep-0420.html#affix_elements">
 *     XEP-0420: Stanza Content Encryption - §4. Affix Elements</a>
 */
public interface AffixExtensionElement extends ExtensionElement, AffixElement {

}
