/*
 * Java GPX Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
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
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmail.com)
 */
package io.jenetics.jpx;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmail.com">Franz Wilhelmstötter</a>
 */
@Test
public class DGPSStationTest extends ObjectTester<DGPSStation> {

	@Override
	Supplier<DGPSStation> factory(final Random random) {
		return () -> DGPSStation.of(random.nextInt(1023));
	}

	@Test
	public void equalsVerifier() {
		EqualsVerifier.forClass(DGPSStation.class).verify();
	}

}
