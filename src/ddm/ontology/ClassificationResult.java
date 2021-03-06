// Distributed Decision making system framework 
// Copyright (c) 2014, Jordi Coll Corbilla
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// - Redistributions of source code must retain the above copyright notice,
// this list of conditions and the following disclaimer.
// - Redistributions in binary form must reproduce the above copyright notice,
// this list of conditions and the following disclaimer in the documentation
// and/or other materials provided with the distribution.
// - Neither the name of this library nor the names of its contributors may be
// used to endorse or promote products derived from this software without
// specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package ddm.ontology;

import jade.content.AgentAction;

/**
 * Protege name: Arff_Repository
 * 
 * @author ontology bean generator
 * @version 2014/04/15, 22:56:31
 */

@SuppressWarnings("serial")
public class ClassificationResult implements AgentAction {

	private String name;
	private String type;
	private long duration;
	private int trainingSize;
	private int numCorrect;
	private double percentage;
	private String instanceValue;
	private String predictedInstanceValue;
	private double instanceClassification;
	private double instancePredictedValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public int getTrainingSize() {
		return trainingSize;
	}

	public void setTrainingSize(int trainingSize) {
		this.trainingSize = trainingSize;
	}

	public int getNumCorrect() {
		return numCorrect;
	}

	public void setNumCorrect(int numCorrect) {
		this.numCorrect = numCorrect;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getInstanceValue() {
		return instanceValue;
	}

	public void setInstanceValue(String instanceValue) {
		this.instanceValue = instanceValue;
	}

	public double getInstanceClassification() {
		return instanceClassification;
	}

	public void setInstanceClassification(double instanceClassification) {
		this.instanceClassification = instanceClassification;
	}

	public double getInstancePredictedValue() {
		return instancePredictedValue;
	}

	public void setInstancePredictedValue(double instancePredictedValue) {
		this.instancePredictedValue = instancePredictedValue;
	}

	public String getPredictedInstanceValue() {
		return predictedInstanceValue;
	}

	public void setPredictedInstanceValue(String predictedInstanceValue) {
		this.predictedInstanceValue = predictedInstanceValue;
	}
}
