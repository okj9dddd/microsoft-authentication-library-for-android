//  Copyright (c) Microsoft Corporation.
//  All rights reserved.
//
//  This code is licensed under the MIT License.
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files(the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions :
//
//  The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//  THE SOFTWARE.
package com.microsoft.identity.client.profile;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

public class Account implements IAccount {

    /**
     * Corresponds to one of AccountType.values()
     */
    public AccountType mAccountType;

    /**
     * Corresponds to preferred_username / upn.
     */
    private String mUsername;

    /**
     * Home tenant user OID.
     */
    private String mId;

    /**
     * The collection of tenant profiles associated to this user.
     */
    private List<ITenantProfile> mTenantProfiles;

    @Nullable
    @Override
    public String getUsername() {
        return mUsername;
    }

    @NonNull
    @Override
    public String getId() {
        return mId;
    }

    @NonNull
    @Override
    public AccountType getAccountType() {
        return mAccountType;
    }

    @NonNull
    @Override
    public List<ITenantProfile> getTenantProfiles() {
        return mTenantProfiles;
    }
}
