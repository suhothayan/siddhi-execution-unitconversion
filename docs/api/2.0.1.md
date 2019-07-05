# API Docs - v2.0.1

## Unitconversion

!!! Info "Tested Siddhi Core version: *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/">5.0.0</a>*"
    It could also support other Siddhi Core minor versions.

### MmTokm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in megameters into kilometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:MmTokm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:MmTokm(1)
```
<p style="word-wrap: break-word">The megameter value <code>1</code> is converted into kilometers as <code>1000.0</code>.</p>

### cmToft *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters to feet.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmToft(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmToft(100)
```
<p style="word-wrap: break-word">The centimeters value <code>100</code> will be converted into feet as <code>3.280</code>.</p>

### cmToin *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters into inches.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmToin(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmToin(100)
```
<p style="word-wrap: break-word">Input centimeters value <code>100</code> will be converted into inches as <code>39.37</code>.</p>

### cmTokm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input value given in centimeters into kilometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmTokm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmTokm(100)
```
<p style="word-wrap: break-word">The centimeters value <code>100</code> is converted into kilometers as <code>0.001</code>.</p>

### cmTom *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters into meters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmTom(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmTom(100)
```
<p style="word-wrap: break-word">The centimeters value <code>100</code> is converted into meters as <code>1.0</code>.</p>

### cmTomi *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters into miles.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmTomi(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmTomi(10000)
```
<p style="word-wrap: break-word">The centimeters value <code>10000</code> is converted into miles as <code>0.062</code>.</p>

### cmTomm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters into millimeters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmTomm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmTomm(1)
```
<p style="word-wrap: break-word">The centimeter value <code>1</code> is converted into millimeters as <code>10.0</code>.</p>

### cmTonm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters into nanometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmTonm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmTonm(1)
```
<p style="word-wrap: break-word">The centimeter value <code>1</code> is converted into nanometers as <code>10000000</code>.</p>

### cmToum *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input in centimeters into micrometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmToum(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmToum(100)
```
<p style="word-wrap: break-word">The centimeters value <code>100</code> is converted into micrometers as <code>1000000.0</code>.</p>

### cmToyd *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in centimeters into yards.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:cmToyd(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:cmToyd(1)
```
<p style="word-wrap: break-word">The centimeter value <code>1</code> is converted into yards as <code>0.01</code>.</p>

### dToh *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in days into hours.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:dToh(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:dToh(1)
```
<p style="word-wrap: break-word">The day value <code>1</code> is converted into hours as <code>24.0</code>.</p>

### gTokg *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in grams into kilograms.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:gTokg(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:gTokg(1000)
```
<p style="word-wrap: break-word">The grams value <code>1000</code> is converted into kilogram as <code>1.0</code>.</p>

### gTomg *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in grams into milligrams.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:gTomg(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:gTomg(1)
```
<p style="word-wrap: break-word">The gram value <code>1</code> is converted into milligrams as <code>1000.0</code>.</p>

### gToug *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in grams into micrograms.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:gToug(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:gToug(1)
```
<p style="word-wrap: break-word">The gram value <code>1</code> is converted into micrograms as <code>1000000.0</code>.</p>

### hTom *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in hours into minutes.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:hTom(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:hTom(1)
```
<p style="word-wrap: break-word">The hour value <code>1</code> is converted into minutes as <code>60.0</code>.</p>

### hTos *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in hours into seconds.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:hTos(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:hTos(1)
```
<p style="word-wrap: break-word">The hour value <code>1</code> is converted into seconds as <code>3600.0</code>.</p>

### kgToLT *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into imperial tons.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgToLT(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgToLT(1000)
```
<p style="word-wrap: break-word">The kilograms value <code>1000</code> is converted into imperial tons as <code>0.9842</code>.</p>

### kgToST *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into US tons.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgToST(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgToST(1000)
```
<p style="word-wrap: break-word">The kilograms value <code>1000</code> is converted into US tons as <code>1.10</code>.</p>

### kgTog *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into grams.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgTog(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgTog(1)
```
<p style="word-wrap: break-word">The kilogram value <code>1</code> is converted into grams as <code>1000</code>.</p>

### kgTolb *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into pounds.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgTolb(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgTolb(1)
```
<p style="word-wrap: break-word">The kilogram value <code>1</code> is converted into pounds as <code>2.2</code>.</p>

### kgTooz *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into ounces.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgTooz(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgTooz(1)
```
<p style="word-wrap: break-word">The kilogram value <code>1</code> is converted into ounces as <code>35.274</code>.</p>

### kgTost *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into imperial stones.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgTost(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgTost(1)
```
<p style="word-wrap: break-word">The kilogram value <code>1</code> is converted into imperial stones as <code>0.157</code>.</p>

### kgTot *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilograms into tonnes.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kgTot(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kgTot(1)
```
<p style="word-wrap: break-word">The kilogram value <code>1</code> is converted into tonnes as <code>0.001</code>.</p>

### kmTocm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into centimeters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmTocm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmTocm(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into centimeters as <code>100000.0</code>.</p>

### kmToft *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into foot.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmToft(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmToft(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into foot as <code>3280.8</code>.</p>

### kmToin *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into inches.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmToin(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmToin(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into inches as <code>39370.08</code>.</p>

### kmTom *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into meters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmTom(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmTom(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into meters as <code>1000.0</code>.</p>

### kmTomi *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into miles.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmTomi(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmTomi(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into miles as <code>0.621</code>.</p>

### kmTomm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into millimeters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmTomm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmTomm(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into millimeters as <code>1000000.0</code>.</p>

### kmTonm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into nanometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmTonm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmTonm(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into nanometers as <code>1000000000000.0</code>.</p>

### kmToum *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into micrometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmToum(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmToum(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into micrometers as <code>1000000000.0</code>.</p>

### kmToyd *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in kilometers into yards.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:kmToyd(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:kmToyd(1)
```
<p style="word-wrap: break-word">The kilometer value <code>1</code> is converted into yards as <code>1093.6</code>.</p>

### lTom3 *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in liters into cubic meters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:lTom3(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:lTom3(1000)
```
<p style="word-wrap: break-word">The liters value <code>1000</code> is converted into cubic meters as <code>1</code>.</p>

### lToml *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in liters into milliliters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:lToml(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:lToml(1)
```
<p style="word-wrap: break-word">The liter value <code>1</code> is converted into milliliters as <code>1000.0</code>.</p>

### m3Tol *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in cubic meters into liters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:m3Tol(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:m3Tol(1)
```
<p style="word-wrap: break-word">The cubic meter value <code>1</code> is converted into liters as <code>1000.0</code>.</p>

### mTocm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in meters into centimeters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:mTocm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:mTocm(1)
```
<p style="word-wrap: break-word">The meter value <code>1</code> is converted to centimeters as <code>100.0</code>.</p>

### mToft *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in meters into foot.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:mToft(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:mToft(1)
```
<p style="word-wrap: break-word">The meter value <code>1</code> is converted into foot as <code>3.280</code>.</p>

### mTomm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in meters into millimeters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:mTomm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:mTomm(1)
```
<p style="word-wrap: break-word">The meter value <code>1</code> is converted into millimeters as <code>1000.0</code>.</p>

### mTos *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in minutes into seconds.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:mTos(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:mTos(1)
```
<p style="word-wrap: break-word">The minute value <code>1</code> is converted into seconds as <code>60.0</code>.</p>

### mToyd *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in meters into yards.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:mToyd(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:mToyd(1)
```
<p style="word-wrap: break-word">The meter value <code>1</code> is converted into yards as <code>1.093</code>.</p>

### miTokm *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in miles into kilometers.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:miTokm(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:miTokm(1)
```
<p style="word-wrap: break-word">The mile value <code>1</code> is converted into kilometers as <code>1.6</code>.</p>

### mlTol *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in milliliters into liters.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:mlTol(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:mlTol(1000)
```
<p style="word-wrap: break-word">The milliliters value <code>1000</code> is converted into liters as <code>1</code>.</p>

### sToms *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in seconds into milliseconds.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:sToms(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:sToms(1)
```
<p style="word-wrap: break-word">The second value <code>1</code> is converted into milliseconds as <code>1000.0</code>.</p>

### sTons *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in seconds into nanoseconds.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:sTons(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:sTons(1)
```
<p style="word-wrap: break-word">The second value <code>1</code> is converted into nanoseconds as <code>1000000000.0</code>.</p>

### sTous *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in seconds into microseconds.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:sTous(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:sTous(1)
```
<p style="word-wrap: break-word">The second value <code>1</code> is converted into microseconds as <code>1000000.0</code>.</p>

### tTog *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in tonnes into grams.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:tTog(<INT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:tTog(1)
```
<p style="word-wrap: break-word">The tonne value <code>1</code> is converted into grams as <code>1000000.0</code>.</p>

### tTokg *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the input given in tonnes into kilograms.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:tTokg(<INT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:tTokg(1)
```
<p style="word-wrap: break-word">The tonne value <code>1</code> is converted into kilograms as <code>1000.0</code>.</p>

### yTod *<a target="_blank" href="http://siddhi.io/en/v5.0/docs/query-guide/#function">(Function)</a>*
<p style="word-wrap: break-word">Function converts the given input in years into days.</p>
<span id="syntax" class="md-typeset" style="display: block; font-weight: bold;">Syntax</span>

```
<DOUBLE> unitconversion:yTod(<INT|LONG|FLOAT|DOUBLE> p1)
```

<span id="query-parameters" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">QUERY PARAMETERS</span>
<table>
    <tr>
        <th>Name</th>
        <th style="min-width: 20em">Description</th>
        <th>Default Value</th>
        <th>Possible Data Types</th>
        <th>Optional</th>
        <th>Dynamic</th>
    </tr>
    <tr>
        <td style="vertical-align: top">p1</td>
        <td style="vertical-align: top; word-wrap: break-word">The value that needs to be converted.</td>
        <td style="vertical-align: top"></td>
        <td style="vertical-align: top">INT<br>LONG<br>FLOAT<br>DOUBLE</td>
        <td style="vertical-align: top">No</td>
        <td style="vertical-align: top">Yes</td>
    </tr>
</table>

<span id="examples" class="md-typeset" style="display: block; font-weight: bold;">Examples</span>
<span id="example-1" class="md-typeset" style="display: block; color: rgba(0, 0, 0, 0.54); font-size: 12.8px; font-weight: bold;">EXAMPLE 1</span>
```
unitconversion:yTod(1)
```
<p style="word-wrap: break-word">The year value <code>1</code> is converted into days as <code>365.2525</code>.</p>

