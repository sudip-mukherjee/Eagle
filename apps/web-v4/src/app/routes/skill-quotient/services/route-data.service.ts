/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3"*/
import { Injectable } from '@angular/core';

//helper imports
import { constants } from "../utils/constant.utils";
import { UtilMethods } from "../utils/util-methods.utils";

@Injectable({
    providedIn: 'root'
})
export class RouteDataService {
    constructor() { }
    obj = {};

    setStoredData(key,value){
        this.obj[key] = value;
    }

    getStoredData(key){
        return this.obj[key];
    }
}
