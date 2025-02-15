/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.unifi.internal.api;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link UniFiExpiredSessionException} signals the session with the controller has expired.
 *
 * @author Matthew Bowman - Initial contribution
 */
@NonNullByDefault
public class UniFiExpiredSessionException extends UniFiException {

    private static final long serialVersionUID = -2002650048964514035L;

    public UniFiExpiredSessionException(final String message) {
        super(message);
    }
}
