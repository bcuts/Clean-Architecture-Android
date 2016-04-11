/*
 * Copyright (C) 2016 Erik Jhordan Rey.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jhordan.euro_cleanarchitecture.di.components;

import android.content.Context;
import com.example.jhordan.euro_cleanarchitecture.di.modules.MainModule;
import com.example.jhordan.euro_cleanarchitecture.view.activity.TeamsActivity;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = MainModule.class) public interface MainComponent {

  void inject(TeamsActivity activity);

  Context context();
}
