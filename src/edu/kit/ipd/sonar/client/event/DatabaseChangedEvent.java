/**
 * This file is part of Sonar.
 *
 * Sonar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Sonar.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.kit.ipd.sonar.client.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * An DatabaseChangedEvent occures if the Contents of the Servers Database have
 * changed.
 */
public class DatabaseChangedEvent
        extends GwtEvent<DatabaseChangedEventHandler> {

    /** Event Type. */
    public static final GwtEvent.Type<DatabaseChangedEventHandler> TYPE
                        = new GwtEvent.Type<DatabaseChangedEventHandler>();

    /**
     * Needed by Gwt.
     *
     * @return An object representing the type of this event.
     */
    @Override
    public GwtEvent.Type<DatabaseChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    /**
     * Needed by GWT.
     *
     * @param handler
     *            The handler which handles this event.
     */
    @Override
    public void dispatch(final DatabaseChangedEventHandler handler) {
        handler.onDatabaseChanged(this);
    }
}


